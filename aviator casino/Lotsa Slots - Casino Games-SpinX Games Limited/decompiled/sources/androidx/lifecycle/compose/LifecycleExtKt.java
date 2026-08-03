package androidx.lifecycle.compose;

/* compiled from: LifecycleExt.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"currentStateAsState", "Landroidx/compose/runtime/State;", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LifecycleExtKt {
    public static final androidx.compose.runtime.State<androidx.lifecycle.Lifecycle.State> currentStateAsState(androidx.lifecycle.Lifecycle lifecycle, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1892357376);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(currentStateAsState)31@1273L16:LifecycleExt.kt#2vxrgp");
        androidx.compose.runtime.State<androidx.lifecycle.Lifecycle.State> collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(lifecycle.getCurrentStateFlow(), null, composer, 8, 1);
        composer.endReplaceableGroup();
        return collectAsState;
    }
}
