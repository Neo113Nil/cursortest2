package org.betup.ui.common.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;

/* compiled from: SwipeRefreshContainer.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001a]\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\r\u001a\u00020\u00052\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\n2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"SwipeRefreshContainer", "", "modifier", "Landroidx/compose/ui/Modifier;", "isRefreshing", "", "onRefresh", "Lkotlin/Function0;", "pullRefreshEnabled", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SwipeRefreshContainerWithLoading", "hasContent", "loadingContent", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwipeRefreshContainerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRefreshContainer$lambda$1(Modifier modifier, boolean z, Function0 function0, boolean z2, Function2 function2, int i, int i2, Composer composer, int i3) {
        SwipeRefreshContainer(modifier, z, function0, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeRefreshContainerWithLoading$lambda$2(Modifier modifier, boolean z, Function0 function0, boolean z2, Function2 function2, Function2 function22, int i, int i2, Composer composer, int i3) {
        SwipeRefreshContainerWithLoading(modifier, z, function0, z2, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeRefreshContainer(Modifier modifier, final boolean z, final Function0<Unit> onRefresh, boolean z2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        int i4;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1676439203);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onRefresh) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z2;
            i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z4 = i6 == 0 ? true : z3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1676439203, i4, -1, "org.betup.ui.common.compose.SwipeRefreshContainer (SwipeRefreshContainer.kt:27)");
                }
                int i7 = i4 >> 3;
                int i8 = i7 & 14;
                PullRefreshState m2661rememberPullRefreshStateUuyPYSY = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(z, onRefresh, 0.0f, 0.0f, startRestartGroup, i7 & 126, 12);
                Modifier pullRefresh = PullRefreshKt.pullRefresh(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY, z4);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh);
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
                content.invoke(startRestartGroup, Integer.valueOf((i4 >> 12) & 14));
                boolean z5 = z4;
                modifier3 = modifier4;
                composer2 = startRestartGroup;
                PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(z, m2661rememberPullRefreshStateUuyPYSY, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, i8 | (PullRefreshState.$stable << 3), 40);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final boolean z6 = z3;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.SwipeRefreshContainerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SwipeRefreshContainer$lambda$1;
                        SwipeRefreshContainer$lambda$1 = SwipeRefreshContainerKt.SwipeRefreshContainer$lambda$1(Modifier.this, z, onRefresh, z6, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SwipeRefreshContainer$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        z3 = z2;
        if ((i2 & 16) == 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i72 = i4 >> 3;
        int i82 = i72 & 14;
        PullRefreshState m2661rememberPullRefreshStateUuyPYSY2 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(z, onRefresh, 0.0f, 0.0f, startRestartGroup, i72 & 126, 12);
        Modifier pullRefresh2 = PullRefreshKt.pullRefresh(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY2, z4);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh2);
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
        content.invoke(startRestartGroup, Integer.valueOf((i4 >> 12) & 14));
        boolean z52 = z4;
        modifier3 = modifier4;
        composer2 = startRestartGroup;
        PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(z, m2661rememberPullRefreshStateUuyPYSY2, boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), false, composer2, i82 | (PullRefreshState.$stable << 3), 40);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeRefreshContainerWithLoading(Modifier modifier, final boolean z, final Function0<Unit> onRefresh, final boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1785331370);
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
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onRefresh) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                final Function2<? super Composer, ? super Integer, Unit> lambda$911372363$app_release = i5 == 0 ? ComposableSingletons$SwipeRefreshContainerKt.INSTANCE.getLambda$911372363$app_release() : function22;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1785331370, i3, -1, "org.betup.ui.common.compose.SwipeRefreshContainerWithLoading (SwipeRefreshContainer.kt:64)");
                }
                SwipeRefreshContainer(modifier4, z, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(1886254885, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.SwipeRefreshContainerKt$SwipeRefreshContainerWithLoading$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1886254885, i6, -1, "org.betup.ui.common.compose.SwipeRefreshContainerWithLoading.<anonymous> (SwipeRefreshContainer.kt:70)");
                        }
                        if (!z || z2) {
                            composer2.startReplaceGroup(-1932668005);
                            content.invoke(composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1932775947);
                            lambda$911372363$app_release.invoke(composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                function22 = lambda$911372363$app_release;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.SwipeRefreshContainerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SwipeRefreshContainerWithLoading$lambda$2;
                        SwipeRefreshContainerWithLoading$lambda$2 = SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading$lambda$2(Modifier.this, z, onRefresh, z2, function22, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SwipeRefreshContainerWithLoading$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        function22 = function2;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        SwipeRefreshContainer(modifier4, z, onRefresh, false, ComposableLambdaKt.rememberComposableLambda(1886254885, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.SwipeRefreshContainerKt$SwipeRefreshContainerWithLoading$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1886254885, i6, -1, "org.betup.ui.common.compose.SwipeRefreshContainerWithLoading.<anonymous> (SwipeRefreshContainer.kt:70)");
                }
                if (!z || z2) {
                    composer2.startReplaceGroup(-1932668005);
                    content.invoke(composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1932775947);
                    lambda$911372363$app_release.invoke(composer2, 0);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        function22 = lambda$911372363$app_release;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
