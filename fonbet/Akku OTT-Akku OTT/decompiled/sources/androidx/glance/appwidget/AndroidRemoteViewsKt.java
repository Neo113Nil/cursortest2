package androidx.glance.appwidget;

import android.widget.RemoteViews;
import androidx.annotation.IdRes;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"AndroidRemoteViews", "", "remoteViews", "Landroid/widget/RemoteViews;", "modifier", "Landroidx/glance/GlanceModifier;", "(Landroid/widget/RemoteViews;Landroidx/glance/GlanceModifier;Landroidx/compose/runtime/Composer;II)V", "containerViewId", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroid/widget/RemoteViews;ILandroidx/glance/GlanceModifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidRemoteViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRemoteViews.kt\nandroidx/glance/appwidget/AndroidRemoteViewsKt\n+ 2 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,92:1\n45#2:93\n46#2:111\n327#3,8:94\n335#3,3:108\n3844#4,6:102\n*S KotlinDebug\n*F\n+ 1 AndroidRemoteViews.kt\nandroidx/glance/appwidget/AndroidRemoteViewsKt\n*L\n60#1:93\n60#1:111\n60#1:94,8\n60#1:108,3\n64#1:102,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidRemoteViewsKt {
    @Composable
    public static final void AndroidRemoteViews(final RemoteViews remoteViews, GlanceModifier glanceModifier, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-647353345);
        if ((i2 & 2) != 0) {
            glanceModifier = GlanceModifier.INSTANCE;
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-647353345, i, -1, "androidx.glance.appwidget.AndroidRemoteViews (AndroidRemoteViews.kt:34)");
        }
        AndroidRemoteViews(remoteViews, -1, glanceModifier2, ComposableSingletons$AndroidRemoteViewsKt.INSTANCE.m1297getLambda1$glance_appwidget_release(), startRestartGroup, ((i << 3) & 896) | 3080, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AndroidRemoteViewsKt$AndroidRemoteViews$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                AndroidRemoteViewsKt.AndroidRemoteViews(remoteViews, glanceModifier2, composer2, i | 1, i2);
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AndroidRemoteViews(final RemoteViews remoteViews, @IdRes final int i, GlanceModifier glanceModifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        Composer startRestartGroup = composer.startRestartGroup(-1388408952);
        if ((i3 & 4) != 0) {
            glanceModifier = GlanceModifier.INSTANCE;
        }
        final GlanceModifier glanceModifier2 = glanceModifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388408952, i2, -1, "androidx.glance.appwidget.AndroidRemoteViews (AndroidRemoteViews.kt:53)");
        }
        AndroidRemoteViewsKt$AndroidRemoteViews$2 androidRemoteViewsKt$AndroidRemoteViews$2 = AndroidRemoteViewsKt$AndroidRemoteViews$2.INSTANCE;
        startRestartGroup.startReplaceableGroup(578571862);
        int i4 = (i2 >> 3) & 896;
        startRestartGroup.startReplaceableGroup(-548224868);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(androidRemoteViewsKt$AndroidRemoteViews$2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
        Updater.m115setimpl(m108constructorimpl, remoteViews, new Function2<EmittableAndroidRemoteViews, RemoteViews, Unit>() { // from class: androidx.glance.appwidget.AndroidRemoteViewsKt$AndroidRemoteViews$3$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableAndroidRemoteViews emittableAndroidRemoteViews, RemoteViews remoteViews2) {
                invoke2(emittableAndroidRemoteViews, remoteViews2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableAndroidRemoteViews emittableAndroidRemoteViews, RemoteViews remoteViews2) {
                emittableAndroidRemoteViews.setRemoteViews(remoteViews2);
            }
        });
        AndroidRemoteViewsKt$AndroidRemoteViews$3$2 androidRemoteViewsKt$AndroidRemoteViews$3$2 = new Function2<EmittableAndroidRemoteViews, Integer, Unit>() { // from class: androidx.glance.appwidget.AndroidRemoteViewsKt$AndroidRemoteViews$3$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableAndroidRemoteViews emittableAndroidRemoteViews, Integer num) {
                invoke(emittableAndroidRemoteViews, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(EmittableAndroidRemoteViews emittableAndroidRemoteViews, int i5) {
                emittableAndroidRemoteViews.setContainerViewId(i5);
            }
        };
        if (m108constructorimpl.getInserting() || !Intrinsics.areEqual(m108constructorimpl.rememberedValue(), Integer.valueOf(i))) {
            m108constructorimpl.updateRememberedValue(Integer.valueOf(i));
            m108constructorimpl.apply(Integer.valueOf(i), androidRemoteViewsKt$AndroidRemoteViews$3$2);
        }
        Updater.m115setimpl(m108constructorimpl, glanceModifier2, new Function2<EmittableAndroidRemoteViews, GlanceModifier, Unit>() { // from class: androidx.glance.appwidget.AndroidRemoteViewsKt$AndroidRemoteViews$3$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableAndroidRemoteViews emittableAndroidRemoteViews, GlanceModifier glanceModifier3) {
                invoke2(emittableAndroidRemoteViews, glanceModifier3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableAndroidRemoteViews emittableAndroidRemoteViews, GlanceModifier glanceModifier3) {
                emittableAndroidRemoteViews.setModifier(glanceModifier3);
            }
        });
        function2.invoke(startRestartGroup, Integer.valueOf((i4 >> 6) & 14));
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AndroidRemoteViewsKt$AndroidRemoteViews$4
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
                AndroidRemoteViewsKt.AndroidRemoteViews(remoteViews, i, glanceModifier2, function2, composer2, i2 | 1, i3);
            }
        });
    }
}
