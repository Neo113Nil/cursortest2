package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyLayout.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"MaxItemsToRetainForReuse", "", "LazyLayout", "", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "measurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0055  */
    @ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyLayout(final LazyLayoutItemProvider itemProvider, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState3;
        Object rememberedValue;
        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        final Modifier modifier3;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(852831187);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyLayout)P(!1,2,3)48@2002L34,50@2068L29,51@2127L104,54@2264L93,68@2602L311,65@2527L392:LazyLayout.kt#wow0x6");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(itemProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
                i3 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(measurePolicy) ? 2048 : 1024;
                }
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    lazyLayoutPrefetchState3 = i4 != 0 ? null : lazyLayoutPrefetchState2;
                    final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(itemProvider, startRestartGroup, i3 & 14);
                    SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new LazyLayoutItemContentFactory(rememberSaveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final LazyLayoutItemProvider invoke() {
                                return rememberUpdatedState.getValue();
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(617316839);
                    ComposerKt.sourceInformation(startRestartGroup, "*58@2391L124");
                    if (lazyLayoutPrefetchState3 != null) {
                        LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState3, lazyLayoutItemContentFactory, subcomposeLayoutState, startRestartGroup, ((i3 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                        Unit unit = Unit.INSTANCE;
                    }
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(lazyLayoutItemContentFactory) | startRestartGroup.changed(measurePolicy);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m631invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m631invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                LazyLayoutItemContentFactory.this.m630onBeforeMeasure0kLqBqw(subcomposeMeasureScope, j);
                                return measurePolicy.invoke(new LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory.this, subcomposeMeasureScope), Constraints.m3784boximpl(j));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, companion, (Function2) rememberedValue3, startRestartGroup, SubcomposeLayoutState.$stable | (i3 & 112), 0);
                    modifier3 = companion;
                    lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    lazyLayoutPrefetchState4 = lazyLayoutPrefetchState2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        LazyLayoutKt.LazyLayout(LazyLayoutItemProvider.this, modifier3, lazyLayoutPrefetchState4, measurePolicy, composer2, i | 1, i2);
                    }
                });
                return;
            }
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 5851) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            final State<? extends LazyLayoutItemProvider> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(itemProvider, startRestartGroup, i3 & 14);
            SaveableStateHolder rememberSaveableStateHolder2 = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutState subcomposeLayoutState2 = (SubcomposeLayoutState) rememberedValue2;
            startRestartGroup.startReplaceableGroup(617316839);
            ComposerKt.sourceInformation(startRestartGroup, "*58@2391L124");
            if (lazyLayoutPrefetchState3 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(lazyLayoutItemContentFactory) | startRestartGroup.changed(measurePolicy);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                    return m631invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final MeasureResult m631invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                    Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                    LazyLayoutItemContentFactory.this.m630onBeforeMeasure0kLqBqw(subcomposeMeasureScope, j);
                    return measurePolicy.invoke(new LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory.this, subcomposeMeasureScope), Constraints.m3784boximpl(j));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState2, companion, (Function2) rememberedValue3, startRestartGroup, SubcomposeLayoutState.$stable | (i3 & 112), 0);
            modifier3 = companion;
            lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        final State<? extends LazyLayoutItemProvider> rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(itemProvider, startRestartGroup, i3 & 14);
        SaveableStateHolder rememberSaveableStateHolder22 = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        SubcomposeLayoutState subcomposeLayoutState22 = (SubcomposeLayoutState) rememberedValue2;
        startRestartGroup.startReplaceableGroup(617316839);
        ComposerKt.sourceInformation(startRestartGroup, "*58@2391L124");
        if (lazyLayoutPrefetchState3 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(lazyLayoutItemContentFactory) | startRestartGroup.changed(measurePolicy);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                return m631invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
            }

            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final MeasureResult m631invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                LazyLayoutItemContentFactory.this.m630onBeforeMeasure0kLqBqw(subcomposeMeasureScope, j);
                return measurePolicy.invoke(new LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory.this, subcomposeMeasureScope), Constraints.m3784boximpl(j));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState22, companion, (Function2) rememberedValue3, startRestartGroup, SubcomposeLayoutState.$stable | (i3 & 112), 0);
        modifier3 = companion;
        lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
