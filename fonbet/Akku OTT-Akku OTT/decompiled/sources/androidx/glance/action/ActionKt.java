package androidx.glance.action;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.glance.ExperimentalGlanceApi;
import androidx.glance.GlanceModifier;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.ws.WebSocketProtocol;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"clickable", "Landroidx/glance/GlanceModifier;", "block", "Lkotlin/Function0;", "", "(Landroidx/glance/GlanceModifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/glance/GlanceModifier;", "onClick", "Landroidx/glance/action/Action;", Constants.KEY, "", "(Landroidx/glance/GlanceModifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/glance/GlanceModifier;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActionKt {
    public static final GlanceModifier clickable(GlanceModifier glanceModifier, Action action) {
        return glanceModifier.then(new ActionModifier(action));
    }

    @Composable
    public static final GlanceModifier clickable(GlanceModifier glanceModifier, Function0<Unit> function0, Composer composer, int i) {
        composer.startReplaceableGroup(-752811653);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-752811653, i, -1, "androidx.glance.action.clickable (Action.kt:41)");
        }
        GlanceModifier then = glanceModifier.then(new ActionModifier(LambdaActionKt.action(null, function0, composer, i & 112, 1)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }

    @Composable
    @ExperimentalGlanceApi
    public static final GlanceModifier clickable(GlanceModifier glanceModifier, String str, Function0<Unit> function0, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-888872320);
        if ((i2 & 1) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-888872320, i, -1, "androidx.glance.action.clickable (Action.kt:57)");
        }
        GlanceModifier then = glanceModifier.then(new ActionModifier(LambdaActionKt.action(str, function0, composer, (i >> 3) & WebSocketProtocol.PAYLOAD_SHORT, 0)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
