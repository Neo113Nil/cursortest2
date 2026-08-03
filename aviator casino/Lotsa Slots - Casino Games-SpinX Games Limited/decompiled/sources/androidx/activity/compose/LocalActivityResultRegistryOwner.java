package androidx.activity.compose;

/* compiled from: ActivityResultRegistry.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/activity/compose/LocalActivityResultRegistryOwner;", "", "()V", "LocalComposition", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/result/ActivityResultRegistryOwner;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "registryOwner", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalActivityResultRegistryOwner {
    public static final int $stable = 0;
    public static final androidx.activity.compose.LocalActivityResultRegistryOwner INSTANCE = new androidx.activity.compose.LocalActivityResultRegistryOwner();
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.activity.result.ActivityResultRegistryOwner> LocalComposition = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<androidx.activity.result.ActivityResultRegistryOwner>() { // from class: androidx.activity.compose.LocalActivityResultRegistryOwner$LocalComposition$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.activity.result.ActivityResultRegistryOwner invoke() {
            return null;
        }
    }, 1, null);

    private LocalActivityResultRegistryOwner() {
    }

    public final androidx.activity.result.ActivityResultRegistryOwner getCurrent(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1418020823);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C47@1947L7,*48@2022L7:ActivityResultRegistry.kt#q1dkbc");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.activity.result.ActivityResultRegistryOwner> providableCompositionLocal = LocalComposition;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(providableCompositionLocal);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner = (androidx.activity.result.ActivityResultRegistryOwner) consume;
        if (activityResultRegistryOwner == null) {
            androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = composer.consume(localContext);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            java.lang.Object obj = (android.content.Context) consume2;
            while (true) {
                if (!(obj instanceof android.content.ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof androidx.activity.result.ActivityResultRegistryOwner) {
                    break;
                }
                obj = ((android.content.ContextWrapper) obj).getBaseContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "innerContext.baseContext");
            }
            activityResultRegistryOwner = (androidx.activity.result.ActivityResultRegistryOwner) obj;
        }
        composer.endReplaceableGroup();
        return activityResultRegistryOwner;
    }

    public final androidx.compose.runtime.ProvidedValue<androidx.activity.result.ActivityResultRegistryOwner> provides(androidx.activity.result.ActivityResultRegistryOwner registryOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registryOwner, "registryOwner");
        return LocalComposition.provides(registryOwner);
    }
}
