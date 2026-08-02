package androidx.glance.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Spacer", "", "modifier", "Landroidx/glance/GlanceModifier;", "(Landroidx/glance/GlanceModifier;Landroidx/compose/runtime/Composer;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpacer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spacer.kt\nandroidx/glance/layout/SpacerKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,52:1\n34#2:53\n35#2:64\n251#3,10:54\n*S KotlinDebug\n*F\n+ 1 Spacer.kt\nandroidx/glance/layout/SpacerKt\n*L\n45#1:53\n45#1:64\n45#1:54,10\n*E\n"})
/* loaded from: classes.dex */
public final class SpacerKt {
    @Composable
    public static final void Spacer(final GlanceModifier glanceModifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1380468206);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(glanceModifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                glanceModifier = GlanceModifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1380468206, i, -1, "androidx.glance.layout.Spacer (Spacer.kt:43)");
            }
            SpacerKt$Spacer$1 spacerKt$Spacer$1 = SpacerKt$Spacer$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1115894518);
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(spacerKt$Spacer$1));
            } else {
                startRestartGroup.useNode();
            }
            Updater.m115setimpl(Updater.m108constructorimpl(startRestartGroup), glanceModifier, new Function2<EmittableSpacer, GlanceModifier, Unit>() { // from class: androidx.glance.layout.SpacerKt$Spacer$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EmittableSpacer emittableSpacer, GlanceModifier glanceModifier2) {
                    invoke2(emittableSpacer, glanceModifier2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EmittableSpacer emittableSpacer, GlanceModifier glanceModifier2) {
                    emittableSpacer.setModifier(glanceModifier2);
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.layout.SpacerKt$Spacer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                SpacerKt.Spacer(GlanceModifier.this, composer2, i | 1, i2);
            }
        });
    }
}
