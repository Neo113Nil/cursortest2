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

@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aB\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a0\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a9\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\rH\u0002¢\u0006\u0002\u0010\u001a\u001a\u0080\u0001\u0010\u001b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u001c*\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001d2#\b\n\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u000b23\b\u0004\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0002\b\u0017¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010$\u001a\u0080\u0001\u0010\u001b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u001c*\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0%2#\b\u0006\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u000b23\b\u0004\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0002\b\u0017¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010&\u001aª\u0001\u0010'\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u001c*\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001d28\b\n\u0010\u0013\u001a2\u0012\u0013\u0012\u00110(¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b()\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\"2H\b\u0004\u0010!\u001aB\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110(¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b()\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030*¢\u0006\u0002\b\u0017¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010+\u001aª\u0001\u0010'\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u001c*\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0%28\b\u0006\u0010\u0013\u001a2\u0012\u0013\u0012\u00110(¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b()\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\"2H\b\u0004\u0010!\u001aB\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110(¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b()\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030*¢\u0006\u0002\b\u0017¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0002\u0010,\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"ReservedItemIdRangeEnd", "", "LazyColumn", "", "activityOptions", "Landroid/os/Bundle;", "modifier", "Landroidx/glance/GlanceModifier;", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/glance/appwidget/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "LazyColumn-ca5uSD8", "(Landroid/os/Bundle;Landroidx/glance/GlanceModifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyColumn-EiNPFjs", "(Landroidx/glance/GlanceModifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyListItem", "itemId", "alignment", "Landroidx/glance/layout/Alignment;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(JLandroidx/glance/layout/Alignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "applyListScope", "(Landroidx/glance/layout/Alignment;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function2;", FirebaseAnalytics.Param.ITEMS, ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/ParameterName;", "name", "item", "itemContent", "Lkotlin/Function2;", "Landroidx/glance/appwidget/lazy/LazyItemScope;", "(Landroidx/glance/appwidget/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/glance/appwidget/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/glance/appwidget/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/glance/appwidget/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/glance/appwidget/lazy/LazyListKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,316:1\n45#2:317\n46#2:329\n45#2:330\n46#2:342\n45#2:343\n46#2:355\n327#3,11:318\n327#3,11:331\n327#3,11:344\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/glance/appwidget/lazy/LazyListKt\n*L\n49#1:317\n49#1:329\n82#1:330\n82#1:342\n144#1:343\n144#1:355\n49#1:318,11\n82#1:331,11\n144#1:344,11\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListKt {
    public static final long ReservedItemIdRangeEnd = -4611686018427387904L;

    @Composable
    /* renamed from: LazyColumn-EiNPFjs, reason: not valid java name */
    public static final void m1335LazyColumnEiNPFjs(GlanceModifier glanceModifier, int i, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1060451148);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(glanceModifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(i)) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(function1) ? 256 : 128;
        }
        if ((i4 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    glanceModifier = GlanceModifier.INSTANCE;
                }
                if ((i3 & 2) != 0) {
                    i = Alignment.INSTANCE.m1367getStartPGIyAqw();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1060451148, i2, -1, "androidx.glance.appwidget.lazy.LazyColumn (LazyList.kt:43)");
            }
            LazyListKt$LazyColumn$1 lazyListKt$LazyColumn$1 = LazyListKt$LazyColumn$1.INSTANCE;
            Function2<Composer, Integer, Unit> applyListScope = applyListScope(new Alignment(i, Alignment.Vertical.INSTANCE.m1387getCenterVerticallymnfRV0w(), null), function1);
            startRestartGroup.startReplaceableGroup(578571862);
            startRestartGroup.startReplaceableGroup(-548224868);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(lazyListKt$LazyColumn$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, glanceModifier, new Function2<EmittableLazyColumn, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyColumn$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyColumn emittableLazyColumn, GlanceModifier glanceModifier2) {
                    invoke2(emittableLazyColumn, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLazyColumn emittableLazyColumn, GlanceModifier glanceModifier2) {
                    emittableLazyColumn.setModifier(glanceModifier2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, Alignment.Horizontal.m1369boximpl(i), new Function2<EmittableLazyColumn, Alignment.Horizontal, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyColumn$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyColumn emittableLazyColumn, Alignment.Horizontal horizontal) {
                    m1337invokeh_Kf0XE(emittableLazyColumn, horizontal.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-h_Kf0XE, reason: not valid java name */
                public final void m1337invokeh_Kf0XE(EmittableLazyColumn emittableLazyColumn, int i6) {
                    emittableLazyColumn.m1331setHorizontalAlignmentuMT220(i6);
                }
            });
            applyListScope.invoke(startRestartGroup, 0);
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyColumn$3
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
                LazyListKt.m1335LazyColumnEiNPFjs(GlanceModifier.this, i6, function1, composer2, i2 | 1, i3);
            }
        });
    }

    @Composable
    @ExperimentalGlanceApi
    /* renamed from: LazyColumn-ca5uSD8, reason: not valid java name */
    public static final void m1336LazyColumnca5uSD8(final Bundle bundle, GlanceModifier glanceModifier, int i, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i2, final int i3) {
        Composer startRestartGroup = composer.startRestartGroup(828768758);
        if ((i3 & 2) != 0) {
            glanceModifier = GlanceModifier.INSTANCE;
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        if ((i3 & 4) != 0) {
            i = Alignment.INSTANCE.m1367getStartPGIyAqw();
        }
        final int i4 = i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(828768758, i2, -1, "androidx.glance.appwidget.lazy.LazyColumn (LazyList.kt:75)");
        }
        LazyListKt$LazyColumn$4 lazyListKt$LazyColumn$4 = LazyListKt$LazyColumn$4.INSTANCE;
        Function2<Composer, Integer, Unit> applyListScope = applyListScope(new Alignment(i4, Alignment.Vertical.INSTANCE.m1387getCenterVerticallymnfRV0w(), null), function1);
        startRestartGroup.startReplaceableGroup(578571862);
        startRestartGroup.startReplaceableGroup(-548224868);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(lazyListKt$LazyColumn$4);
        } else {
            startRestartGroup.useNode();
        }
        Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
        Updater.m115setimpl(m108constructorimpl, glanceModifier2, new Function2<EmittableLazyColumn, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyColumn$5$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyColumn emittableLazyColumn, GlanceModifier glanceModifier3) {
                invoke2(emittableLazyColumn, glanceModifier3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableLazyColumn emittableLazyColumn, GlanceModifier glanceModifier3) {
                emittableLazyColumn.setModifier(glanceModifier3);
            }
        });
        Updater.m115setimpl(m108constructorimpl, Alignment.Horizontal.m1369boximpl(i4), new Function2<EmittableLazyColumn, Alignment.Horizontal, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyColumn$5$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyColumn emittableLazyColumn, Alignment.Horizontal horizontal) {
                m1338invokeh_Kf0XE(emittableLazyColumn, horizontal.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-h_Kf0XE, reason: not valid java name */
            public final void m1338invokeh_Kf0XE(EmittableLazyColumn emittableLazyColumn, int i5) {
                emittableLazyColumn.m1331setHorizontalAlignmentuMT220(i5);
            }
        });
        Updater.m115setimpl(m108constructorimpl, bundle, new Function2<EmittableLazyColumn, Bundle, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyColumn$5$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyColumn emittableLazyColumn, Bundle bundle2) {
                invoke2(emittableLazyColumn, bundle2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableLazyColumn emittableLazyColumn, Bundle bundle2) {
                emittableLazyColumn.setActivityOptions(bundle2);
            }
        });
        applyListScope.invoke(startRestartGroup, 0);
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyColumn$6
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

            public final void invoke(Composer composer2, int i5) {
                LazyListKt.m1336LazyColumnca5uSD8(bundle, glanceModifier2, i4, function1, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void LazyListItem(final long j, final Alignment alignment, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-2015416678);
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
                ComposerKt.traceEventStart(-2015416678, i2, -1, "androidx.glance.appwidget.lazy.LazyListItem (LazyList.kt:135)");
            }
            startRestartGroup.startMovableGroup(-1488189941, Long.valueOf(j));
            LazyListKt$LazyListItem$1 lazyListKt$LazyListItem$1 = LazyListKt$LazyListItem$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(578571862);
            int i3 = i2 & 896;
            startRestartGroup.startReplaceableGroup(-548224868);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(lazyListKt$LazyListItem$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, Long.valueOf(j), new Function2<EmittableLazyListItem, Long, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyListItem$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyListItem emittableLazyListItem, Long l) {
                    invoke(emittableLazyListItem, l.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(EmittableLazyListItem emittableLazyListItem, long j2) {
                    emittableLazyListItem.setItemId(j2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, alignment, new Function2<EmittableLazyListItem, Alignment, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyListItem$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLazyListItem emittableLazyListItem, Alignment alignment2) {
                    invoke2(emittableLazyListItem, alignment2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLazyListItem emittableLazyListItem, Alignment alignment2) {
                    emittableLazyListItem.setAlignment(alignment2);
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$LazyListItem$3
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
                LazyListKt.LazyListItem(j, alignment, function2, composer2, i | 1);
            }
        });
    }

    private static final Function2<Composer, Integer, Unit> applyListScope(final Alignment alignment, Function1<? super LazyListScope, Unit> function1) {
        final ArrayList arrayList = new ArrayList();
        function1.invoke(new LazyListScope() { // from class: androidx.glance.appwidget.lazy.LazyListKt$applyListScope$listScopeImpl$1
            @Override // androidx.glance.appwidget.lazy.LazyListScope
            @ComposableInferredTarget(scheme = "[0[0]]")
            public void item(long itemId, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
                if (itemId != Long.MIN_VALUE && itemId <= -4611686018427387904L) {
                    throw new IllegalArgumentException("You may not specify item ids less than -4611686018427387904 in a Glance\nwidget. These are reserved.");
                }
                arrayList.add(TuplesKt.to(Long.valueOf(itemId), content));
            }

            @Override // androidx.glance.appwidget.lazy.LazyListScope
            @ComposableInferredTarget(scheme = "[0[0]]")
            public void items(int count, Function1<? super Integer, Long> itemId, final Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
                for (final int i = 0; i < count; i++) {
                    item(itemId.invoke(Integer.valueOf(i)).longValue(), ComposableLambdaKt.composableLambdaInstance(19676320, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$applyListScope$listScopeImpl$1$items$1$1
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
                                ComposerKt.traceEventStart(19676320, i2, -1, "androidx.glance.appwidget.lazy.applyListScope.<no name provided>.items.<anonymous>.<anonymous> (LazyList.kt:117)");
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
        return ComposableLambdaKt.composableLambdaInstance(1748368075, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$applyListScope$1
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
                    ComposerKt.traceEventStart(1748368075, i, -1, "androidx.glance.appwidget.lazy.applyListScope.<anonymous> (LazyList.kt:122)");
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
                    LazyListKt.LazyListItem(longValue, alignment2, ComposableLambdaKt.composableLambda(composer, -163738694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.lazy.LazyListKt$applyListScope$1$1$2
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
                                ComposerKt.traceEventStart(-163738694, i4, -1, "androidx.glance.appwidget.lazy.applyListScope.<anonymous>.<anonymous>.<anonymous> (LazyList.kt:127)");
                            }
                            function3.invoke(new LazyItemScope() { // from class: androidx.glance.appwidget.lazy.LazyListKt$applyListScope$1$1$2.1
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
    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, Function1<? super T, Long> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(list.size(), new LazyListKt$items$2(function1, list), ComposableLambdaKt.composableLambdaInstance(33490014, true, new LazyListKt$items$3(function4, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: androidx.glance.appwidget.lazy.LazyListKt$items$1
                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(Object obj2) {
                    return Long.MIN_VALUE;
                }
            };
        }
        lazyListScope.items(list.size(), new LazyListKt$items$2(function1, list), ComposableLambdaKt.composableLambdaInstance(33490014, true, new LazyListKt$items$3(function4, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, Function2<? super Integer, ? super T, Long> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(list.size(), new LazyListKt$itemsIndexed$2(function2, list), ComposableLambdaKt.composableLambdaInstance(-1405343893, true, new LazyListKt$itemsIndexed$3(function5, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: androidx.glance.appwidget.lazy.LazyListKt$itemsIndexed$1
                public final Long invoke(int i2, Object obj2) {
                    return Long.MIN_VALUE;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(list.size(), new LazyListKt$itemsIndexed$2(function2, list), ComposableLambdaKt.composableLambdaInstance(-1405343893, true, new LazyListKt$itemsIndexed$3(function5, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, Function1<? super T, Long> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(tArr.length, new LazyListKt$items$5(function1, tArr), ComposableLambdaKt.composableLambdaInstance(663369809, true, new LazyListKt$items$6(function4, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, Function2<? super Integer, ? super T, Long> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(tArr.length, new LazyListKt$itemsIndexed$5(function2, tArr), ComposableLambdaKt.composableLambdaInstance(-331010528, true, new LazyListKt$itemsIndexed$6(function5, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: androidx.glance.appwidget.lazy.LazyListKt$items$4
                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(Object obj2) {
                    return Long.MIN_VALUE;
                }
            };
        }
        lazyListScope.items(objArr.length, new LazyListKt$items$5(function1, objArr), ComposableLambdaKt.composableLambdaInstance(663369809, true, new LazyListKt$items$6(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: androidx.glance.appwidget.lazy.LazyListKt$itemsIndexed$4
                public final Long invoke(int i2, Object obj2) {
                    return Long.MIN_VALUE;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(objArr.length, new LazyListKt$itemsIndexed$5(function2, objArr), ComposableLambdaKt.composableLambdaInstance(-331010528, true, new LazyListKt$itemsIndexed$6(function5, objArr)));
    }
}
