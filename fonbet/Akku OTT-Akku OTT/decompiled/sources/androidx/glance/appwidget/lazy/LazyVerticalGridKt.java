package androidx.glance.appwidget.lazy;

import android.os.Bundle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.Applier;
import androidx.glance.ExperimentalGlanceApi;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aJ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a0\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a9\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0000¢\u0006\u0002\u0010\u001b\u001a\u0080\u0001\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001d*\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001e2#\b\n\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00140\u000b23\b\u0004\u0010\"\u001a-\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010#¢\u0006\u0002\b\u0018¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010%\u001a\u0080\u0001\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001d*\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0&2#\b\u0006\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00140\u000b23\b\u0004\u0010\"\u001a-\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010#¢\u0006\u0002\b\u0018¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010'\u001aª\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001d*\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001e28\b\n\u0010\u0013\u001a2\u0012\u0013\u0012\u00110)¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(*\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00140#2H\b\u0004\u0010\"\u001aB\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110)¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(*\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010+¢\u0006\u0002\b\u0018¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010,\u001aª\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001d*\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0&28\b\u0006\u0010\u0013\u001a2\u0012\u0013\u0012\u00110)¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(*\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00140#2H\b\u0004\u0010\"\u001aB\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110)¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(*\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010+¢\u0006\u0002\b\u0018¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"LazyVerticalGrid", "", "gridCells", "Landroidx/glance/appwidget/lazy/GridCells;", "activityOptions", "Landroid/os/Bundle;", "modifier", "Landroidx/glance/GlanceModifier;", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/glance/appwidget/lazy/LazyVerticalGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyVerticalGrid-tdtSkkI", "(Landroidx/glance/appwidget/lazy/GridCells;Landroid/os/Bundle;Landroidx/glance/GlanceModifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalGrid-ca5uSD8", "(Landroidx/glance/appwidget/lazy/GridCells;Landroidx/glance/GlanceModifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalGridItem", "itemId", "", "alignment", "Landroidx/glance/layout/Alignment;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(JLandroidx/glance/layout/Alignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "applyVerticalGridScope", "(Landroidx/glance/layout/Alignment;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function2;", FirebaseAnalytics.Param.ITEMS, ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/ParameterName;", "name", "item", "itemContent", "Lkotlin/Function2;", "Landroidx/glance/appwidget/lazy/LazyItemScope;", "(Landroidx/glance/appwidget/lazy/LazyVerticalGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/glance/appwidget/lazy/LazyVerticalGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/glance/appwidget/lazy/LazyVerticalGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/glance/appwidget/lazy/LazyVerticalGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyVerticalGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyVerticalGrid.kt\nandroidx/glance/appwidget/lazy/LazyVerticalGridKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,379:1\n45#2:380\n46#2:392\n45#2:393\n46#2:405\n45#2:406\n46#2:418\n327#3,11:381\n327#3,11:394\n327#3,11:407\n*S KotlinDebug\n*F\n+ 1 LazyVerticalGrid.kt\nandroidx/glance/appwidget/lazy/LazyVerticalGridKt\n*L\n51#1:380\n51#1:392\n87#1:393\n87#1:405\n153#1:406\n153#1:418\n51#1:381,11\n87#1:394,11\n153#1:407,11\n*E\n"})
/* loaded from: classes.dex */
public final class LazyVerticalGridKt {
    @Composable
    /* renamed from: LazyVerticalGrid-ca5uSD8, reason: not valid java name */
    public static final void m1339LazyVerticalGridca5uSD8(final GridCells gridCells, GlanceModifier glanceModifier, int i, final Function1<? super LazyVerticalGridScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-2047392247);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(glanceModifier) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(i)) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(function1) ? 2048 : 1024;
        }
        if ((i4 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    glanceModifier = GlanceModifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    i = Alignment.INSTANCE.m1367getStartPGIyAqw();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2047392247, i2, -1, "androidx.glance.appwidget.lazy.LazyVerticalGrid (LazyVerticalGrid.kt:44)");
            }
            LazyVerticalGridKt$LazyVerticalGrid$1 lazyVerticalGridKt$LazyVerticalGrid$1 = LazyVerticalGridKt$LazyVerticalGrid$1.INSTANCE;
            Function2<Composer, Integer, Unit> applyVerticalGridScope = applyVerticalGridScope(new Alignment(i, Alignment.Vertical.INSTANCE.m1387getCenterVerticallymnfRV0w(), null), function1);
            startRestartGroup.startReplaceableGroup(578571862);
            startRestartGroup.startReplaceableGroup(-548224868);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(lazyVerticalGridKt$LazyVerticalGrid$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, gridCells, new Function2<EmittableLazyVerticalGrid, GridCells, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGrid$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyVerticalGrid emittableLazyVerticalGrid, GridCells gridCells2) {
                    invoke2(emittableLazyVerticalGrid, gridCells2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLazyVerticalGrid emittableLazyVerticalGrid, GridCells gridCells2) {
                    emittableLazyVerticalGrid.setGridCells(gridCells2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, glanceModifier, new Function2<EmittableLazyVerticalGrid, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGrid$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyVerticalGrid emittableLazyVerticalGrid, GlanceModifier glanceModifier2) {
                    invoke2(emittableLazyVerticalGrid, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLazyVerticalGrid emittableLazyVerticalGrid, GlanceModifier glanceModifier2) {
                    emittableLazyVerticalGrid.setModifier(glanceModifier2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, Alignment.Horizontal.m1369boximpl(i), new Function2<EmittableLazyVerticalGrid, Alignment.Horizontal, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGrid$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyVerticalGrid emittableLazyVerticalGrid, Alignment.Horizontal horizontal) {
                    m1341invokeh_Kf0XE(emittableLazyVerticalGrid, horizontal.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-h_Kf0XE, reason: not valid java name */
                public final void m1341invokeh_Kf0XE(EmittableLazyVerticalGrid emittableLazyVerticalGrid, int i6) {
                    emittableLazyVerticalGrid.m1333setHorizontalAlignmentuMT220(i6);
                }
            });
            applyVerticalGridScope.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        final int i6 = i;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGrid$3
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

            public final void invoke(Composer composer2, int i7) {
                LazyVerticalGridKt.m1339LazyVerticalGridca5uSD8(GridCells.this, glanceModifier2, i6, function1, composer2, i2 | 1, i3);
            }
        });
    }

    @Composable
    @ExperimentalGlanceApi
    /* renamed from: LazyVerticalGrid-tdtSkkI, reason: not valid java name */
    public static final void m1340LazyVerticalGridtdtSkkI(final GridCells gridCells, final Bundle bundle, GlanceModifier glanceModifier, int i, final Function1<? super LazyVerticalGridScope, Unit> function1, Composer composer, int i2, final int i3) {
        final int i4;
        Composer startRestartGroup = composer.startRestartGroup(2103725789);
        if ((i3 & 4) != 0) {
            glanceModifier = GlanceModifier.INSTANCE;
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        if ((i3 & 8) != 0) {
            i = Alignment.INSTANCE.m1367getStartPGIyAqw();
        }
        final int i5 = i;
        if (ComposerKt.isTraceInProgress()) {
            i4 = i2;
            ComposerKt.traceEventStart(2103725789, i4, -1, "androidx.glance.appwidget.lazy.LazyVerticalGrid (LazyVerticalGrid.kt:79)");
        } else {
            i4 = i2;
        }
        LazyVerticalGridKt$LazyVerticalGrid$4 lazyVerticalGridKt$LazyVerticalGrid$4 = LazyVerticalGridKt$LazyVerticalGrid$4.INSTANCE;
        Function2<Composer, Integer, Unit> applyVerticalGridScope = applyVerticalGridScope(new Alignment(i5, Alignment.Vertical.INSTANCE.m1387getCenterVerticallymnfRV0w(), null), function1);
        startRestartGroup.startReplaceableGroup(578571862);
        startRestartGroup.startReplaceableGroup(-548224868);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(lazyVerticalGridKt$LazyVerticalGrid$4);
        } else {
            startRestartGroup.useNode();
        }
        Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
        Updater.m115setimpl(m108constructorimpl, gridCells, new Function2<EmittableLazyVerticalGrid, GridCells, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGrid$5$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyVerticalGrid emittableLazyVerticalGrid, GridCells gridCells2) {
                invoke2(emittableLazyVerticalGrid, gridCells2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableLazyVerticalGrid emittableLazyVerticalGrid, GridCells gridCells2) {
                emittableLazyVerticalGrid.setGridCells(gridCells2);
            }
        });
        Updater.m115setimpl(m108constructorimpl, glanceModifier2, new Function2<EmittableLazyVerticalGrid, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGrid$5$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyVerticalGrid emittableLazyVerticalGrid, GlanceModifier glanceModifier3) {
                invoke2(emittableLazyVerticalGrid, glanceModifier3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableLazyVerticalGrid emittableLazyVerticalGrid, GlanceModifier glanceModifier3) {
                emittableLazyVerticalGrid.setModifier(glanceModifier3);
            }
        });
        Updater.m115setimpl(m108constructorimpl, Alignment.Horizontal.m1369boximpl(i5), new Function2<EmittableLazyVerticalGrid, Alignment.Horizontal, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGrid$5$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyVerticalGrid emittableLazyVerticalGrid, Alignment.Horizontal horizontal) {
                m1342invokeh_Kf0XE(emittableLazyVerticalGrid, horizontal.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-h_Kf0XE, reason: not valid java name */
            public final void m1342invokeh_Kf0XE(EmittableLazyVerticalGrid emittableLazyVerticalGrid, int i6) {
                emittableLazyVerticalGrid.m1333setHorizontalAlignmentuMT220(i6);
            }
        });
        Updater.m115setimpl(m108constructorimpl, bundle, new Function2<EmittableLazyVerticalGrid, Bundle, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGrid$5$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyVerticalGrid emittableLazyVerticalGrid, Bundle bundle2) {
                invoke2(emittableLazyVerticalGrid, bundle2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableLazyVerticalGrid emittableLazyVerticalGrid, Bundle bundle2) {
                emittableLazyVerticalGrid.setActivityOptions(bundle2);
            }
        });
        applyVerticalGridScope.invoke(startRestartGroup, 0);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGrid$6
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
                LazyVerticalGridKt.m1340LazyVerticalGridtdtSkkI(GridCells.this, bundle, glanceModifier2, i5, function1, composer2, i4 | 1, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void LazyVerticalGridItem(final long j, final Alignment alignment, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(982284890);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(982284890, i2, -1, "androidx.glance.appwidget.lazy.LazyVerticalGridItem (LazyVerticalGrid.kt:144)");
            }
            startRestartGroup.startMovableGroup(-250207478, Long.valueOf(j));
            LazyVerticalGridKt$LazyVerticalGridItem$1 lazyVerticalGridKt$LazyVerticalGridItem$1 = LazyVerticalGridKt$LazyVerticalGridItem$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(578571862);
            int i3 = i2 & 896;
            startRestartGroup.startReplaceableGroup(-548224868);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(lazyVerticalGridKt$LazyVerticalGridItem$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, Long.valueOf(j), new Function2<EmittableLazyVerticalGridListItem, Long, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGridItem$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyVerticalGridListItem emittableLazyVerticalGridListItem, Long l) {
                    invoke(emittableLazyVerticalGridListItem, l.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(EmittableLazyVerticalGridListItem emittableLazyVerticalGridListItem, long j2) {
                    emittableLazyVerticalGridListItem.setItemId(j2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, alignment, new Function2<EmittableLazyVerticalGridListItem, Alignment, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGridItem$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyVerticalGridListItem emittableLazyVerticalGridListItem, Alignment alignment2) {
                    invoke2(emittableLazyVerticalGridListItem, alignment2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLazyVerticalGridListItem emittableLazyVerticalGridListItem, Alignment alignment2) {
                    emittableLazyVerticalGridListItem.setAlignment(alignment2);
                }
            });
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$LazyVerticalGridItem$3
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

            public final void invoke(Composer composer2, int i4) {
                LazyVerticalGridKt.LazyVerticalGridItem(j, alignment, function2, composer2, i | 1);
            }
        });
    }

    public static final Function2<Composer, Integer, Unit> applyVerticalGridScope(final Alignment alignment, Function1<? super LazyVerticalGridScope, Unit> function1) {
        final ArrayList arrayList = new ArrayList();
        function1.invoke(new LazyVerticalGridScope() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$applyVerticalGridScope$listScopeImpl$1
            @Override // androidx.glance.appwidget.lazy.LazyVerticalGridScope
            @ComposableInferredTarget(scheme = "[0[0]]")
            public void item(long itemId, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
                if (itemId != Long.MIN_VALUE && itemId <= -4611686018427387904L) {
                    throw new IllegalArgumentException("You may not specify item ids less than -4611686018427387904 in a Glance\nwidget. These are reserved.");
                }
                arrayList.add(TuplesKt.to(Long.valueOf(itemId), content));
            }

            @Override // androidx.glance.appwidget.lazy.LazyVerticalGridScope
            @ComposableInferredTarget(scheme = "[0[0]]")
            public void items(int count, Function1<? super Integer, Long> itemId, final Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
                for (final int i = 0; i < count; i++) {
                    item(itemId.invoke(Integer.valueOf(i)).longValue(), ComposableLambdaKt.composableLambdaInstance(104469668, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$applyVerticalGridScope$listScopeImpl$1$items$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i2) {
                            if ((i2 & 14) == 0) {
                                i2 |= composer.changed(lazyItemScope) ? 4 : 2;
                            }
                            if ((i2 & 91) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(104469668, i2, -1, "androidx.glance.appwidget.lazy.applyVerticalGridScope.<no name provided>.items.<anonymous>.<anonymous> (LazyVerticalGrid.kt:124)");
                            }
                            itemContent.invoke(lazyItemScope, Integer.valueOf(i), composer, Integer.valueOf(i2 & 14));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
            }
        });
        return ComposableLambdaKt.composableLambdaInstance(-628089649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$applyVerticalGridScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-628089649, i, -1, "androidx.glance.appwidget.lazy.applyVerticalGridScope.<anonymous> (LazyVerticalGrid.kt:129)");
                }
                List<Pair<Long, Function3<LazyItemScope, Composer, Integer, Unit>>> list = arrayList;
                Alignment alignment2 = alignment;
                int i2 = 0;
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Pair pair = (Pair) obj;
                    Long l = (Long) pair.component1();
                    final Function3 function3 = (Function3) pair.component2();
                    if (l != null && l.longValue() == Long.MIN_VALUE) {
                        l = null;
                    }
                    long longValue = l != null ? l.longValue() : (-4611686018427387904L) - i2;
                    if (longValue == Long.MIN_VALUE) {
                        throw new IllegalStateException("Implicit list item ids exhausted.");
                    }
                    LazyVerticalGridKt.LazyVerticalGridItem(longValue, alignment2, ComposableLambdaKt.composableLambda(composer, -1015790400, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$applyVerticalGridScope$1$1$2
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

                        @Composable
                        public final void invoke(Composer composer2, int i4) {
                            if ((i4 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1015790400, i4, -1, "androidx.glance.appwidget.lazy.applyVerticalGridScope.<anonymous>.<anonymous>.<anonymous> (LazyVerticalGrid.kt:136)");
                            }
                            function3.invoke(new LazyItemScope() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$applyVerticalGridScope$1$1$2.1
                            }, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer, (Alignment.$stable << 3) | 384);
                    i2 = i3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyVerticalGridScope lazyVerticalGridScope, List<? extends T> list, Function1<? super T, Long> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyVerticalGridScope.items(list.size(), new LazyVerticalGridKt$items$2(function1, list), ComposableLambdaKt.composableLambdaInstance(-693260830, true, new LazyVerticalGridKt$items$3(function4, list)));
    }

    public static /* synthetic */ void items$default(LazyVerticalGridScope lazyVerticalGridScope, List list, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$items$1
                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(Object obj2) {
                    return Long.MIN_VALUE;
                }
            };
        }
        lazyVerticalGridScope.items(list.size(), new LazyVerticalGridKt$items$2(function1, list), ComposableLambdaKt.composableLambdaInstance(-693260830, true, new LazyVerticalGridKt$items$3(function4, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyVerticalGridScope lazyVerticalGridScope, List<? extends T> list, Function2<? super Integer, ? super T, Long> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyVerticalGridScope.items(list.size(), new LazyVerticalGridKt$itemsIndexed$2(function2, list), ComposableLambdaKt.composableLambdaInstance(-2105063253, true, new LazyVerticalGridKt$itemsIndexed$3(function5, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyVerticalGridScope lazyVerticalGridScope, List list, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$itemsIndexed$1
                public final Long invoke(int i2, Object obj2) {
                    return Long.MIN_VALUE;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyVerticalGridScope.items(list.size(), new LazyVerticalGridKt$itemsIndexed$2(function2, list), ComposableLambdaKt.composableLambdaInstance(-2105063253, true, new LazyVerticalGridKt$itemsIndexed$3(function5, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyVerticalGridScope lazyVerticalGridScope, T[] tArr, Function1<? super T, Long> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyVerticalGridScope.items(tArr.length, new LazyVerticalGridKt$items$5(function1, tArr), ComposableLambdaKt.composableLambdaInstance(315415057, true, new LazyVerticalGridKt$items$6(function4, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyVerticalGridScope lazyVerticalGridScope, T[] tArr, Function2<? super Integer, ? super T, Long> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyVerticalGridScope.items(tArr.length, new LazyVerticalGridKt$itemsIndexed$5(function2, tArr), ComposableLambdaKt.composableLambdaInstance(-1310895196, true, new LazyVerticalGridKt$itemsIndexed$6(function5, tArr)));
    }

    public static /* synthetic */ void items$default(LazyVerticalGridScope lazyVerticalGridScope, Object[] objArr, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$items$4
                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(Object obj2) {
                    return Long.MIN_VALUE;
                }
            };
        }
        lazyVerticalGridScope.items(objArr.length, new LazyVerticalGridKt$items$5(function1, objArr), ComposableLambdaKt.composableLambdaInstance(315415057, true, new LazyVerticalGridKt$items$6(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyVerticalGridScope lazyVerticalGridScope, Object[] objArr, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: androidx.glance.appwidget.lazy.LazyVerticalGridKt$itemsIndexed$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }

                public final Long invoke(int i2, Object obj2) {
                    return Long.MIN_VALUE;
                }
            };
        }
        lazyVerticalGridScope.items(objArr.length, new LazyVerticalGridKt$itemsIndexed$5(function2, objArr), ComposableLambdaKt.composableLambdaInstance(-1310895196, true, new LazyVerticalGridKt$itemsIndexed$6(function5, objArr)));
    }
}
