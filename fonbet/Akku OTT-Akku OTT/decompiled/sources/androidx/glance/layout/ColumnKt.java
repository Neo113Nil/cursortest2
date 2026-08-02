package androidx.glance.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Column", "", "modifier", "Landroidx/glance/GlanceModifier;", "verticalAlignment", "Landroidx/glance/layout/Alignment$Vertical;", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/glance/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Column-K4GKKTE", "(Landroidx/glance/GlanceModifier;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/glance/layout/ColumnKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,100:1\n45#2:101\n46#2:113\n327#3,11:102\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/glance/layout/ColumnKt\n*L\n90#1:101\n90#1:113\n90#1:102,11\n*E\n"})
/* loaded from: classes.dex */
public final class ColumnKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: Column-K4GKKTE, reason: not valid java name */
    public static final void m1389ColumnK4GKKTE(GlanceModifier glanceModifier, int i, int i2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4) {
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1883910253);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(glanceModifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i5 |= startRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((i5 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                glanceModifier = GlanceModifier.INSTANCE;
            }
            if (i7 != 0) {
                i = Alignment.INSTANCE.m1368getTopmnfRV0w();
            }
            if (i8 != 0) {
                i2 = Alignment.INSTANCE.m1367getStartPGIyAqw();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1883910253, i5, -1, "androidx.glance.layout.Column (Column.kt:83)");
            }
            ColumnKt$Column$1 columnKt$Column$1 = ColumnKt$Column$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(578571862);
            startRestartGroup.startReplaceableGroup(-548224868);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(columnKt$Column$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, glanceModifier, new Function2<EmittableColumn, GlanceModifier, Unit>() { // from class: androidx.glance.layout.ColumnKt$Column$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableColumn emittableColumn, GlanceModifier glanceModifier2) {
                    invoke2(emittableColumn, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableColumn emittableColumn, GlanceModifier glanceModifier2) {
                    emittableColumn.setModifier(glanceModifier2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, Alignment.Horizontal.m1369boximpl(i2), new Function2<EmittableColumn, Alignment.Horizontal, Unit>() { // from class: androidx.glance.layout.ColumnKt$Column$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableColumn emittableColumn, Alignment.Horizontal horizontal) {
                    m1390invokeh_Kf0XE(emittableColumn, horizontal.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-h_Kf0XE, reason: not valid java name */
                public final void m1390invokeh_Kf0XE(EmittableColumn emittableColumn, int i9) {
                    emittableColumn.m1404setHorizontalAlignmentuMT220(i9);
                }
            });
            Updater.m115setimpl(m108constructorimpl, Alignment.Vertical.m1379boximpl(i), new Function2<EmittableColumn, Alignment.Vertical, Unit>() { // from class: androidx.glance.layout.ColumnKt$Column$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableColumn emittableColumn, Alignment.Vertical vertical) {
                    m1391invokeUKyfEZk(emittableColumn, vertical.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-UKyfEZk, reason: not valid java name */
                public final void m1391invokeUKyfEZk(EmittableColumn emittableColumn, int i9) {
                    emittableColumn.m1405setVerticalAlignmentJe2gTW8(i9);
                }
            });
            function3.invoke(ColumnScopeImplInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i5 >> 6) & 112) | 6));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        final int i9 = i;
        final int i10 = i2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.layout.ColumnKt$Column$4
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

            public final void invoke(Composer composer2, int i11) {
                ColumnKt.m1389ColumnK4GKKTE(GlanceModifier.this, i9, i10, function3, composer2, i3 | 1, i4);
            }
        });
    }
}
