package androidx.glance.appwidget;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceComposable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"IgnoreResult", "", "(Landroidx/compose/runtime/Composer;I)V", "shouldIgnoreResult", "", "Landroidx/glance/Emittable;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIgnoreResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IgnoreResult.kt\nandroidx/glance/appwidget/IgnoreResultKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n34#2:58\n35#2:69\n251#3,10:59\n1747#4,3:70\n*S KotlinDebug\n*F\n+ 1 IgnoreResult.kt\nandroidx/glance/appwidget/IgnoreResultKt\n*L\n36#1:58\n36#1:69\n36#1:59,10\n54#1:70,3\n*E\n"})
/* loaded from: classes.dex */
public final class IgnoreResultKt {
    @Composable
    @GlanceComposable
    public static final void IgnoreResult(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1257244356);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257244356, i, -1, "androidx.glance.appwidget.IgnoreResult (IgnoreResult.kt:34)");
            }
            final IgnoreResultKt$IgnoreResult$1 ignoreResultKt$IgnoreResult$1 = IgnoreResultKt$IgnoreResult$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1115894518);
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new Function0<EmittableIgnoreResult>() { // from class: androidx.glance.appwidget.IgnoreResultKt$IgnoreResult$$inlined$GlanceNode$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.glance.appwidget.EmittableIgnoreResult, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final EmittableIgnoreResult invoke() {
                        return Function0.this.invoke();
                    }
                });
            } else {
                startRestartGroup.useNode();
            }
            Updater.m108constructorimpl(startRestartGroup);
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.IgnoreResultKt$IgnoreResult$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                IgnoreResultKt.IgnoreResult(composer2, i | 1);
            }
        });
    }

    public static final boolean shouldIgnoreResult(Emittable emittable) {
        if (emittable instanceof EmittableIgnoreResult) {
            return true;
        }
        if (!(emittable instanceof EmittableWithChildren)) {
            return false;
        }
        List<Emittable> children = ((EmittableWithChildren) emittable).getChildren();
        if (children != null && children.isEmpty()) {
            return false;
        }
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            if (shouldIgnoreResult((Emittable) it.next())) {
                return true;
            }
        }
        return false;
    }
}
