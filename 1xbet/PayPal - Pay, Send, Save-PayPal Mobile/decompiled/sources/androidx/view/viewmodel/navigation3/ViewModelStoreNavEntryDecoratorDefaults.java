package androidx.view.viewmodel.navigation3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/lifecycle/viewmodel/navigation3/ViewModelStoreNavEntryDecoratorDefaults;", "", "<init>", "()V", "Lkotlin/Function0;", "", "removeViewModelStoreOnPop", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewModelStoreNavEntryDecoratorDefaults {
    public static final int $stable = 0;
    public static final androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorDefaults INSTANCE = new androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorDefaults();

    private ViewModelStoreNavEntryDecoratorDefaults() {
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> removeViewModelStoreOnPop(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(151991252, i, -1, "androidx.lifecycle.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorDefaults.removeViewModelStoreOnPop (ViewModelStoreNavEntryDecorator.android.kt:27)");
        }
        final android.app.Activity activity = (android.app.Activity) composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
        boolean changedInstance = composer.changedInstance(activity);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.lifecycle.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorDefaults$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorDefaults.$r8$lambda$Dg3LOyAGEUBXP84Bf0HJXLXzohc(activity));
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0<java.lang.Boolean> function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return function0;
    }

    public static /* synthetic */ boolean $r8$lambda$Dg3LOyAGEUBXP84Bf0HJXLXzohc(android.app.Activity activity) {
        boolean z = false;
        if (activity != null && activity.isChangingConfigurations()) {
            z = true;
        }
        return !z;
    }
}
