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
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Box", "", "modifier", "Landroidx/glance/GlanceModifier;", "contentAlignment", "Landroidx/glance/layout/Alignment;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/glance/GlanceModifier;Landroidx/glance/layout/Alignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/glance/layout/BoxKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,76:1\n45#2:77\n46#2:89\n327#3,11:78\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/glance/layout/BoxKt\n*L\n67#1:77\n67#1:89\n67#1:78,11\n*E\n"})
/* loaded from: classes.dex */
public final class BoxKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void Box(GlanceModifier glanceModifier, Alignment alignment, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1959221577);
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
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                glanceModifier = GlanceModifier.INSTANCE;
            }
            if (i5 != 0) {
                alignment = Alignment.INSTANCE.getTopStart();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1959221577, i3, -1, "androidx.glance.layout.Box (Box.kt:61)");
            }
            BoxKt$Box$1 boxKt$Box$1 = BoxKt$Box$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(578571862);
            int i6 = i3 & 896;
            startRestartGroup.startReplaceableGroup(-548224868);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(boxKt$Box$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
            Updater.m115setimpl(m108constructorimpl, glanceModifier, new Function2<EmittableBox, GlanceModifier, Unit>() { // from class: androidx.glance.layout.BoxKt$Box$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableBox emittableBox, GlanceModifier glanceModifier2) {
                    invoke2(emittableBox, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableBox emittableBox, GlanceModifier glanceModifier2) {
                    emittableBox.setModifier(glanceModifier2);
                }
            });
            Updater.m115setimpl(m108constructorimpl, alignment, new Function2<EmittableBox, Alignment, Unit>() { // from class: androidx.glance.layout.BoxKt$Box$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableBox emittableBox, Alignment alignment2) {
                    invoke2(emittableBox, alignment2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableBox emittableBox, Alignment alignment2) {
                    emittableBox.setContentAlignment(alignment2);
                }
            });
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        final Alignment alignment2 = alignment;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.layout.BoxKt$Box$3
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
                BoxKt.Box(GlanceModifier.this, alignment2, function2, composer2, i | 1, i2);
            }
        });
    }
}
