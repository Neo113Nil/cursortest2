package androidx.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "Landroidx/savedstate/internal/SavedStateRegistryImpl;", "p0", "<init>", "(Landroidx/savedstate/internal/SavedStateRegistryImpl;)V", "", "performAttach", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "savedState", "performRestore", "(Landroid/os/Bundle;)V", "outBundle", "performSave", "Camera2StreamConfigurationMap", "Landroidx/savedstate/internal/SavedStateRegistryImpl;", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateRegistryController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.SavedStateRegistryController.Companion INSTANCE = new androidx.view.SavedStateRegistryController.Companion(null);
    private final androidx.view.internal.SavedStateRegistryImpl Camera2StreamConfigurationMap;
    private final androidx.view.SavedStateRegistry savedStateRegistry;

    private SavedStateRegistryController(androidx.view.internal.SavedStateRegistryImpl savedStateRegistryImpl) {
        this.Camera2StreamConfigurationMap = savedStateRegistryImpl;
        this.savedStateRegistry = new androidx.view.SavedStateRegistry(savedStateRegistryImpl);
    }

    public final androidx.view.SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void performAttach() {
        this.Camera2StreamConfigurationMap.performAttach();
    }

    public final void performRestore(android.os.Bundle savedState) {
        this.Camera2StreamConfigurationMap.performRestore$savedstate(savedState);
    }

    public final void performSave(android.os.Bundle outBundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outBundle, "");
        this.Camera2StreamConfigurationMap.performSave$savedstate(outBundle);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "<init>", "()V", "Landroidx/savedstate/SavedStateRegistryOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Landroidx/savedstate/SavedStateRegistryController;", "create", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/savedstate/SavedStateRegistryController;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.SavedStateRegistryController create(final androidx.view.SavedStateRegistryOwner owner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
            return new androidx.view.SavedStateRegistryController(new androidx.view.internal.SavedStateRegistryImpl(owner, new kotlin.jvm.functions.Function0() { // from class: androidx.savedstate.SavedStateRegistryController$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.SavedStateRegistryController.Companion.$r8$lambda$mYKAg7nh_JcP4XSEzfHJKM82YOw(androidx.view.SavedStateRegistryOwner.this);
                }
            }), null);
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$mYKAg7nh_JcP4XSEzfHJKM82YOw(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner) {
            savedStateRegistryOwner.getLifecycle().addObserver(new androidx.view.Recreator(savedStateRegistryOwner));
            return kotlin.Unit.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.SavedStateRegistryController create(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner) {
        return INSTANCE.create(savedStateRegistryOwner);
    }

    public /* synthetic */ SavedStateRegistryController(androidx.view.internal.SavedStateRegistryImpl savedStateRegistryImpl, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateRegistryImpl);
    }
}
