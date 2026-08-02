package androidx.view.viewmodel.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviderImpl;", "", "Landroidx/lifecycle/ViewModelStore;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultExtras", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "modelClass", "", "key", "getViewModel$lifecycle_viewmodel", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/ViewModelStore;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewModelProviderImpl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.ViewModelStore getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.viewmodel.CreationExtras Camera2StreamConfigurationMap;
    private final androidx.view.viewmodel.internal.SynchronizedObject getHighSpeedVideoFpsRanges;
    private final androidx.lifecycle.ViewModelProvider.Factory getHighSpeedVideoFpsRangesFor;

    public ViewModelProviderImpl(androidx.view.ViewModelStore viewModelStore, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        this.getHighResolutionOutputSizeshNQ4ISI = viewModelStore;
        this.getHighSpeedVideoFpsRangesFor = factory;
        this.Camera2StreamConfigurationMap = creationExtras;
        this.getHighSpeedVideoFpsRanges = new androidx.view.viewmodel.internal.SynchronizedObject();
    }

    public static /* synthetic */ androidx.view.ViewModel getViewModel$lifecycle_viewmodel$default(androidx.view.viewmodel.internal.ViewModelProviderImpl viewModelProviderImpl, kotlin.reflect.KClass kClass, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel(kClass);
        }
        return viewModelProviderImpl.getViewModel$lifecycle_viewmodel(kClass, str);
    }

    public final <T extends androidx.view.ViewModel> T getViewModel$lifecycle_viewmodel(kotlin.reflect.KClass<T> modelClass, java.lang.String key) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            t = (T) this.getHighResolutionOutputSizeshNQ4ISI.get(key);
            if (modelClass.isInstance(t)) {
                if (this.getHighSpeedVideoFpsRangesFor instanceof androidx.lifecycle.ViewModelProvider.OnRequeryFactory) {
                    androidx.lifecycle.ViewModelProvider.OnRequeryFactory onRequeryFactory = (androidx.lifecycle.ViewModelProvider.OnRequeryFactory) this.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                    onRequeryFactory.onRequery(t);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
            } else {
                androidx.view.viewmodel.MutableCreationExtras mutableCreationExtras = new androidx.view.viewmodel.MutableCreationExtras(this.Camera2StreamConfigurationMap);
                mutableCreationExtras.set(androidx.view.ViewModelProvider.VIEW_MODEL_KEY, key);
                t = (T) androidx.view.viewmodel.internal.ViewModelProviderImpl_androidKt.createViewModel(this.getHighSpeedVideoFpsRangesFor, modelClass, mutableCreationExtras);
                this.getHighResolutionOutputSizeshNQ4ISI.put(key, t);
            }
        }
        return t;
    }
}
