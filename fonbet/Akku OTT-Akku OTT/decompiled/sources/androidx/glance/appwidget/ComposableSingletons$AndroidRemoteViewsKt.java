package androidx.glance.appwidget;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$AndroidRemoteViewsKt {
    public static final ComposableSingletons$AndroidRemoteViewsKt INSTANCE = new ComposableSingletons$AndroidRemoteViewsKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1lambda1 = ComposableLambdaKt.composableLambdaInstance(757789032, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.ComposableSingletons$AndroidRemoteViewsKt$lambda-1$1
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
                ComposerKt.traceEventStart(757789032, i, -1, "androidx.glance.appwidget.ComposableSingletons$AndroidRemoteViewsKt.lambda-1.<anonymous> (AndroidRemoteViews.kt:38)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$glance_appwidget_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1297getLambda1$glance_appwidget_release() {
        return f1lambda1;
    }
}
