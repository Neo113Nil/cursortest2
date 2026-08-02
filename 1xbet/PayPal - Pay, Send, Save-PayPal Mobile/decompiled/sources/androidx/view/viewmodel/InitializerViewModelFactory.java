package androidx.view.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "<init>", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)V", "Landroidx/lifecycle/ViewModel;", "VM", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "", "Camera2StreamConfigurationMap", "[Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitializerViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.viewmodel.ViewModelInitializer<?>[] getHighSpeedVideoFpsRangesFor;

    public InitializerViewModelFactory(androidx.view.viewmodel.ViewModelInitializer<?>... viewModelInitializerArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelInitializerArr, "");
        this.getHighSpeedVideoFpsRangesFor = viewModelInitializerArr;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <VM extends androidx.view.ViewModel> VM create(java.lang.Class<VM> modelClass, androidx.view.viewmodel.CreationExtras extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
        androidx.view.viewmodel.internal.ViewModelProviders viewModelProviders = androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE;
        kotlin.reflect.KClass<VM> kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(modelClass);
        androidx.view.viewmodel.ViewModelInitializer<?>[] viewModelInitializerArr = this.getHighSpeedVideoFpsRangesFor;
        return (VM) viewModelProviders.createViewModelFromInitializers$lifecycle_viewmodel(kotlinClass, extras, (androidx.view.viewmodel.ViewModelInitializer[]) java.util.Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
