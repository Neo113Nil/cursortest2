package androidx.activity.compose;

/* compiled from: BackHandler.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;", "", "()V", "LocalOnBackPressedDispatcherOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/OnBackPressedDispatcherOwner;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "dispatcherOwner", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalOnBackPressedDispatcherOwner {
    public static final int $stable = 0;
    public static final androidx.activity.compose.LocalOnBackPressedDispatcherOwner INSTANCE = new androidx.activity.compose.LocalOnBackPressedDispatcherOwner();
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.activity.OnBackPressedDispatcherOwner> LocalOnBackPressedDispatcherOwner = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<androidx.activity.OnBackPressedDispatcherOwner>() { // from class: androidx.activity.compose.LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.activity.OnBackPressedDispatcherOwner invoke() {
            return null;
        }
    }, 1, null);

    private LocalOnBackPressedDispatcherOwner() {
    }

    public final androidx.activity.OnBackPressedDispatcherOwner getCurrent(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-2068013981);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C50@2094L7,*52@2246L7:BackHandler.kt#q1dkbc");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.activity.OnBackPressedDispatcherOwner> providableCompositionLocal = LocalOnBackPressedDispatcherOwner;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(providableCompositionLocal);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.activity.OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (androidx.activity.OnBackPressedDispatcherOwner) consume;
        composer.startReplaceableGroup(1680121597);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "51@2127L7");
        if (onBackPressedDispatcherOwner == null) {
            androidx.compose.runtime.ProvidableCompositionLocal<android.view.View> localView = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = composer.consume(localView);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            onBackPressedDispatcherOwner = androidx.activity.ViewTreeOnBackPressedDispatcherOwner.get((android.view.View) consume2);
        }
        composer.endReplaceableGroup();
        if (onBackPressedDispatcherOwner == null) {
            androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3 = composer.consume(localContext);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            java.lang.Object obj = (android.content.Context) consume3;
            while (true) {
                if (!(obj instanceof android.content.ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof androidx.activity.OnBackPressedDispatcherOwner) {
                    break;
                }
                obj = ((android.content.ContextWrapper) obj).getBaseContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "innerContext.baseContext");
            }
            onBackPressedDispatcherOwner = (androidx.activity.OnBackPressedDispatcherOwner) obj;
        }
        composer.endReplaceableGroup();
        return onBackPressedDispatcherOwner;
    }

    public final androidx.compose.runtime.ProvidedValue<androidx.activity.OnBackPressedDispatcherOwner> provides(androidx.activity.OnBackPressedDispatcherOwner dispatcherOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcherOwner, "dispatcherOwner");
        return LocalOnBackPressedDispatcherOwner.provides(dispatcherOwner);
    }
}
