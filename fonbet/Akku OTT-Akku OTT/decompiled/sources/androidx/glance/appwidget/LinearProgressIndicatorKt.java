package androidx.glance.appwidget;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.app.NotificationCompat;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"LinearProgressIndicator", "", "modifier", "Landroidx/glance/GlanceModifier;", "color", "Landroidx/glance/unit/ColorProvider;", "backgroundColor", "(Landroidx/glance/GlanceModifier;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_PROGRESS, "", "(FLandroidx/glance/GlanceModifier;Landroidx/glance/unit/ColorProvider;Landroidx/glance/unit/ColorProvider;Landroidx/compose/runtime/Composer;II)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinearProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearProgressIndicator.kt\nandroidx/glance/appwidget/LinearProgressIndicatorKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,124:1\n34#2:125\n35#2:136\n34#2:137\n35#2:148\n251#3,10:126\n251#3,10:138\n*S KotlinDebug\n*F\n+ 1 LinearProgressIndicator.kt\nandroidx/glance/appwidget/LinearProgressIndicatorKt\n*L\n43#1:125\n43#1:136\n68#1:137\n68#1:148\n43#1:126,10\n68#1:138,10\n*E\n"})
/* loaded from: classes.dex */
public final class LinearProgressIndicatorKt {
    @Composable
    public static final void LinearProgressIndicator(final float f, GlanceModifier glanceModifier, ColorProvider colorProvider, ColorProvider colorProvider2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-12096187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(glanceModifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 1024;
        }
        if ((i2 & 12) == 12 && (i3 & 5851) == 1170 && startRestartGroup.getSkipping()) {
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
                if (i6 != 0) {
                    colorProvider2 = ProgressIndicatorDefaults.INSTANCE.getBackgroundColorProvider();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-12096187, i, -1, "androidx.glance.appwidget.LinearProgressIndicator (LinearProgressIndicator.kt:35)");
            }
            final LinearProgressIndicatorKt$LinearProgressIndicator$1 linearProgressIndicatorKt$LinearProgressIndicator$1 = LinearProgressIndicatorKt$LinearProgressIndicator$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1115894518);
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new Function0<EmittableLinearProgressIndicator>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$$inlined$GlanceNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.glance.appwidget.EmittableLinearProgressIndicator, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final EmittableLinearProgressIndicator invoke() {
                        return Function0.this.invoke();
                    }
                });
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, glanceModifier, new Function2<EmittableLinearProgressIndicator, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, GlanceModifier glanceModifier2) {
                    invoke2(emittableLinearProgressIndicator, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLinearProgressIndicator emittableLinearProgressIndicator, GlanceModifier glanceModifier2) {
                    emittableLinearProgressIndicator.setModifier(glanceModifier2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, Float.valueOf(f), new Function2<EmittableLinearProgressIndicator, Float, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, Float f2) {
                    invoke(emittableLinearProgressIndicator, f2.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, float f2) {
                    emittableLinearProgressIndicator.setProgress(f2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, colorProvider, new Function2<EmittableLinearProgressIndicator, ColorProvider, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, ColorProvider colorProvider3) {
                    invoke2(emittableLinearProgressIndicator, colorProvider3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLinearProgressIndicator emittableLinearProgressIndicator, ColorProvider colorProvider3) {
                    emittableLinearProgressIndicator.setColor(colorProvider3);
                }
            });
            Updater.m115setimpl(m108constructorimpl, colorProvider2, new Function2<EmittableLinearProgressIndicator, ColorProvider, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, ColorProvider colorProvider3) {
                    invoke2(emittableLinearProgressIndicator, colorProvider3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLinearProgressIndicator emittableLinearProgressIndicator, ColorProvider colorProvider3) {
                    emittableLinearProgressIndicator.setBackgroundColor(colorProvider3);
                }
            });
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        final ColorProvider colorProvider3 = colorProvider;
        final ColorProvider colorProvider4 = colorProvider2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                LinearProgressIndicatorKt.LinearProgressIndicator(f, glanceModifier2, colorProvider3, colorProvider4, composer2, i | 1, i2);
            }
        });
    }

    @Composable
    public static final void LinearProgressIndicator(GlanceModifier glanceModifier, ColorProvider colorProvider, ColorProvider colorProvider2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1130088971);
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
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 128;
        }
        if ((i2 & 6) == 6 && (i3 & 731) == 146 && startRestartGroup.getSkipping()) {
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
                if (i6 != 0) {
                    colorProvider2 = ProgressIndicatorDefaults.INSTANCE.getBackgroundColorProvider();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1130088971, i, -1, "androidx.glance.appwidget.LinearProgressIndicator (LinearProgressIndicator.kt:62)");
            }
            final LinearProgressIndicatorKt$LinearProgressIndicator$4 linearProgressIndicatorKt$LinearProgressIndicator$4 = LinearProgressIndicatorKt$LinearProgressIndicator$4.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1115894518);
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new Function0<EmittableLinearProgressIndicator>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$$inlined$GlanceNode$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.glance.appwidget.EmittableLinearProgressIndicator, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final EmittableLinearProgressIndicator invoke() {
                        return Function0.this.invoke();
                    }
                });
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, glanceModifier, new Function2<EmittableLinearProgressIndicator, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$5$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, GlanceModifier glanceModifier2) {
                    invoke2(emittableLinearProgressIndicator, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLinearProgressIndicator emittableLinearProgressIndicator, GlanceModifier glanceModifier2) {
                    emittableLinearProgressIndicator.setModifier(glanceModifier2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, Boolean.TRUE, new Function2<EmittableLinearProgressIndicator, Boolean, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$5$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, Boolean bool) {
                    invoke(emittableLinearProgressIndicator, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, boolean z) {
                    emittableLinearProgressIndicator.setIndeterminate(z);
                }
            });
            Updater.m115setimpl(m108constructorimpl, colorProvider, new Function2<EmittableLinearProgressIndicator, ColorProvider, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$5$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, ColorProvider colorProvider3) {
                    invoke2(emittableLinearProgressIndicator, colorProvider3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLinearProgressIndicator emittableLinearProgressIndicator, ColorProvider colorProvider3) {
                    emittableLinearProgressIndicator.setColor(colorProvider3);
                }
            });
            Updater.m115setimpl(m108constructorimpl, colorProvider2, new Function2<EmittableLinearProgressIndicator, ColorProvider, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$5$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableLinearProgressIndicator emittableLinearProgressIndicator, ColorProvider colorProvider3) {
                    invoke2(emittableLinearProgressIndicator, colorProvider3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableLinearProgressIndicator emittableLinearProgressIndicator, ColorProvider colorProvider3) {
                    emittableLinearProgressIndicator.setBackgroundColor(colorProvider3);
                }
            });
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        final ColorProvider colorProvider3 = colorProvider;
        final ColorProvider colorProvider4 = colorProvider2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.LinearProgressIndicatorKt$LinearProgressIndicator$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                LinearProgressIndicatorKt.LinearProgressIndicator(GlanceModifier.this, colorProvider3, colorProvider4, composer2, i | 1, i2);
            }
        });
    }
}
