package androidx.glance.appwidget;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"CircularProgressIndicator", "", "modifier", "Landroidx/glance/GlanceModifier;", "color", "Landroidx/glance/unit/ColorProvider;", "(Landroidx/glance/GlanceModifier;Landroidx/glance/unit/ColorProvider;Landroidx/compose/runtime/Composer;II)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCircularProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularProgressIndicator.kt\nandroidx/glance/appwidget/CircularProgressIndicatorKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,59:1\n34#2:60\n35#2:71\n251#3,10:61\n*S KotlinDebug\n*F\n+ 1 CircularProgressIndicator.kt\nandroidx/glance/appwidget/CircularProgressIndicatorKt\n*L\n36#1:60\n36#1:71\n36#1:61,10\n*E\n"})
/* loaded from: classes.dex */
public final class CircularProgressIndicatorKt {
    @Composable
    public static final void CircularProgressIndicator(final GlanceModifier glanceModifier, final ColorProvider colorProvider, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-525156579);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(glanceModifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 16;
        }
        if (i5 == 2 && (i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    glanceModifier = GlanceModifier.INSTANCE;
                }
                if (i5 != 0) {
                    colorProvider = ProgressIndicatorDefaults.INSTANCE.getIndicatorColorProvider();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-525156579, i, -1, "androidx.glance.appwidget.CircularProgressIndicator (CircularProgressIndicator.kt:31)");
            }
            final CircularProgressIndicatorKt$CircularProgressIndicator$1 circularProgressIndicatorKt$CircularProgressIndicator$1 = CircularProgressIndicatorKt$CircularProgressIndicator$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1115894518);
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new Function0<EmittableCircularProgressIndicator>() { // from class: androidx.glance.appwidget.CircularProgressIndicatorKt$CircularProgressIndicator$$inlined$GlanceNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.glance.appwidget.EmittableCircularProgressIndicator, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final EmittableCircularProgressIndicator invoke() {
                        return Function0.this.invoke();
                    }
                });
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, glanceModifier, new Function2<EmittableCircularProgressIndicator, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.CircularProgressIndicatorKt$CircularProgressIndicator$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableCircularProgressIndicator emittableCircularProgressIndicator, GlanceModifier glanceModifier2) {
                    invoke2(emittableCircularProgressIndicator, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableCircularProgressIndicator emittableCircularProgressIndicator, GlanceModifier glanceModifier2) {
                    emittableCircularProgressIndicator.setModifier(glanceModifier2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, colorProvider, new Function2<EmittableCircularProgressIndicator, ColorProvider, Unit>() { // from class: androidx.glance.appwidget.CircularProgressIndicatorKt$CircularProgressIndicator$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableCircularProgressIndicator emittableCircularProgressIndicator, ColorProvider colorProvider2) {
                    invoke2(emittableCircularProgressIndicator, colorProvider2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableCircularProgressIndicator emittableCircularProgressIndicator, ColorProvider colorProvider2) {
                    emittableCircularProgressIndicator.setColor(colorProvider2);
                }
            });
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.CircularProgressIndicatorKt$CircularProgressIndicator$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                CircularProgressIndicatorKt.CircularProgressIndicator(GlanceModifier.this, colorProvider, composer2, i | 1, i2);
            }
        });
    }
}
