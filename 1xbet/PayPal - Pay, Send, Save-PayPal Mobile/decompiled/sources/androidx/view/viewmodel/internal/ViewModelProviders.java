package androidx.view.viewmodel.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0014\"\u0006\u0012\u0002\b\u00030\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001d\u001a\u00020\u001a2\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0014\"\u0006\u0012\u0002\b\u00030\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "modelClass", "", "getDefaultKey$lifecycle_viewmodel", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "VM", "unsupportedCreateViewModel$lifecycle_viewmodel", "()Landroidx/lifecycle/ViewModel;", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "Landroidx/lifecycle/ViewModelProvider$Factory;", "createInitializerFactory$lifecycle_viewmodel", "(Ljava/util/Collection;)Landroidx/lifecycle/ViewModelProvider$Factory;", "", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModelStoreOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "getDefaultFactory$lifecycle_viewmodel", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultCreationExtras$lifecycle_viewmodel", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "createViewModelFromInitializers$lifecycle_viewmodel", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;[Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewModelProviders {
    public static final androidx.view.viewmodel.internal.ViewModelProviders INSTANCE = new androidx.view.viewmodel.internal.ViewModelProviders();

    private ViewModelProviders() {
    }

    public final <T extends androidx.view.ViewModel> java.lang.String getDefaultKey$lifecycle_viewmodel(kotlin.reflect.KClass<T> modelClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        java.lang.String canonicalName = androidx.view.viewmodel.internal.CanonicalName_jvmKt.getCanonicalName(modelClass);
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(java.lang.String.valueOf(canonicalName));
    }

    public final <VM extends androidx.view.ViewModel> VM unsupportedCreateViewModel$lifecycle_viewmodel() {
        throw new java.lang.UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public final androidx.lifecycle.ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel(androidx.view.viewmodel.ViewModelInitializer<?>... initializers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializers, "");
        return new androidx.view.viewmodel.InitializerViewModelFactory((androidx.view.viewmodel.ViewModelInitializer[]) java.util.Arrays.copyOf(initializers, initializers.length));
    }

    public final androidx.lifecycle.ViewModelProvider.Factory getDefaultFactory$lifecycle_viewmodel(androidx.view.ViewModelStoreOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        if (owner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            return ((androidx.view.HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory();
        }
        return androidx.view.viewmodel.internal.DefaultViewModelProviderFactory.INSTANCE;
    }

    public final androidx.view.viewmodel.CreationExtras getDefaultCreationExtras$lifecycle_viewmodel(androidx.view.ViewModelStoreOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        if (owner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            return ((androidx.view.HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras();
        }
        return androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
    }

    public final androidx.lifecycle.ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel(java.util.Collection<? extends androidx.view.viewmodel.ViewModelInitializer<?>> initializers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializers, "");
        androidx.view.viewmodel.ViewModelInitializer[] viewModelInitializerArr = (androidx.view.viewmodel.ViewModelInitializer[]) initializers.toArray(new androidx.view.viewmodel.ViewModelInitializer[0]);
        return new androidx.view.viewmodel.InitializerViewModelFactory((androidx.view.viewmodel.ViewModelInitializer[]) java.util.Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }

    public final <VM extends androidx.view.ViewModel> VM createViewModelFromInitializers$lifecycle_viewmodel(kotlin.reflect.KClass<VM> modelClass, androidx.view.viewmodel.CreationExtras extras, androidx.view.viewmodel.ViewModelInitializer<?>... initializers) {
        VM vm;
        androidx.view.viewmodel.ViewModelInitializer<?> viewModelInitializer;
        kotlin.jvm.functions.Function1<androidx.view.viewmodel.CreationExtras, ?> initializer$lifecycle_viewmodel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializers, "");
        int length = initializers.length;
        int i = 0;
        while (true) {
            vm = null;
            if (i >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = initializers[i];
            if (kotlin.jvm.internal.Intrinsics.areEqual(viewModelInitializer.getClazz$lifecycle_viewmodel(), modelClass)) {
                break;
            }
            i++;
        }
        if (viewModelInitializer != null && (initializer$lifecycle_viewmodel = viewModelInitializer.getInitializer$lifecycle_viewmodel()) != null) {
            vm = (VM) initializer$lifecycle_viewmodel.invoke(extras);
        }
        if (vm != null) {
            return vm;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No initializer set for given class ");
        sb.append(androidx.view.viewmodel.internal.CanonicalName_jvmKt.getCanonicalName(modelClass));
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }
}
