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

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Row", "", "modifier", "Landroidx/glance/GlanceModifier;", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", "verticalAlignment", "Landroidx/glance/layout/Alignment$Vertical;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/glance/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Row-lMAjyxE", "(Landroidx/glance/GlanceModifier;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/glance/layout/RowKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,101:1\n45#2:102\n46#2:114\n327#3,11:103\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/glance/layout/RowKt\n*L\n91#1:102\n91#1:114\n91#1:103,11\n*E\n"})
/* loaded from: classes.dex */
public final class RowKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: Row-lMAjyxE, reason: not valid java name */
    public static final void m1436RowlMAjyxE(GlanceModifier glanceModifier, int i, int i2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4) {
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1618370649);
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
                i = Alignment.INSTANCE.m1367getStartPGIyAqw();
            }
            if (i8 != 0) {
                i2 = Alignment.INSTANCE.m1368getTopmnfRV0w();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1618370649, i5, -1, "androidx.glance.layout.Row (Row.kt:84)");
            }
            RowKt$Row$1 rowKt$Row$1 = RowKt$Row$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(578571862);
            startRestartGroup.startReplaceableGroup(-548224868);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(rowKt$Row$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, glanceModifier, new Function2<EmittableRow, GlanceModifier, Unit>() { // from class: androidx.glance.layout.RowKt$Row$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableRow emittableRow, GlanceModifier glanceModifier2) {
                    invoke2(emittableRow, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableRow emittableRow, GlanceModifier glanceModifier2) {
                    emittableRow.setModifier(glanceModifier2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, Alignment.Vertical.m1379boximpl(i2), new Function2<EmittableRow, Alignment.Vertical, Unit>() { // from class: androidx.glance.layout.RowKt$Row$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableRow emittableRow, Alignment.Vertical vertical) {
                    m1437invokeUKyfEZk(emittableRow, vertical.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-UKyfEZk, reason: not valid java name */
                public final void m1437invokeUKyfEZk(EmittableRow emittableRow, int i9) {
                    emittableRow.m1409setVerticalAlignmentJe2gTW8(i9);
                }
            });
            Updater.m115setimpl(m108constructorimpl, Alignment.Horizontal.m1369boximpl(i), new Function2<EmittableRow, Alignment.Horizontal, Unit>() { // from class: androidx.glance.layout.RowKt$Row$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableRow emittableRow, Alignment.Horizontal horizontal) {
                    m1438invokeh_Kf0XE(emittableRow, horizontal.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-h_Kf0XE, reason: not valid java name */
                public final void m1438invokeh_Kf0XE(EmittableRow emittableRow, int i9) {
                    emittableRow.m1408setHorizontalAlignmentuMT220(i9);
                }
            });
            function3.invoke(RowScopeImplInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i5 >> 6) & 112) | 6));
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.layout.RowKt$Row$4
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
                RowKt.m1436RowlMAjyxE(GlanceModifier.this, i9, i10, function3, composer2, i3 | 1, i4);
            }
        });
    }
}
