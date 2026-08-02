package androidx.view;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u0000  2\u00020\u0001:\u0005!\"#$ B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u0010J(\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0018J0\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u001bJ0\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "Landroidx/lifecycle/viewmodel/internal/ViewModelProviderImpl;", "p0", "<init>", "(Landroidx/lifecycle/viewmodel/internal/ViewModelProviderImpl;)V", "Landroidx/lifecycle/ViewModelStore;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultCreationExtras", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "modelClass", "get", "(Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "", "key", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/viewmodel/internal/ViewModelProviderImpl;", "Camera2StreamConfigurationMap", "Companion", "Factory", "OnRequeryFactory", "NewInstanceFactory", "AndroidViewModelFactory"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ViewModelProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.ViewModelProvider.Companion INSTANCE = new androidx.view.ViewModelProvider.Companion(null);
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> VIEW_MODEL_KEY;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.view.viewmodel.internal.ViewModelProviderImpl Camera2StreamConfigurationMap;

    private ViewModelProvider(androidx.view.viewmodel.internal.ViewModelProviderImpl viewModelProviderImpl) {
        this.Camera2StreamConfigurationMap = viewModelProviderImpl;
    }

    public /* synthetic */ ViewModelProvider(androidx.view.ViewModelStore viewModelStore, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.lifecycle.viewmodel.CreationExtras.Empty empty, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, factory, (i & 4) != 0 ? androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE : empty);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(androidx.view.ViewModelStore viewModelStore, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras) {
        this(new androidx.view.viewmodel.internal.ViewModelProviderImpl(viewModelStore, factory, creationExtras));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(androidx.view.ViewModelStoreOwner viewModelStoreOwner) {
        this(viewModelStoreOwner.getViewModelStore(), androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel(viewModelStoreOwner), androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel(viewModelStoreOwner));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(androidx.view.ViewModelStoreOwner viewModelStoreOwner, androidx.lifecycle.ViewModelProvider.Factory factory) {
        this(viewModelStoreOwner.getViewModelStore(), factory, androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel(viewModelStoreOwner));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
    }

    public final <T extends androidx.view.ViewModel> T get(kotlin.reflect.KClass<T> modelClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        return (T) androidx.view.viewmodel.internal.ViewModelProviderImpl.getViewModel$lifecycle_viewmodel$default(this.Camera2StreamConfigurationMap, modelClass, null, 2, null);
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelStoreOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "Landroidx/lifecycle/ViewModelProvider;", "create", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModelProvider;", "Landroidx/lifecycle/ViewModelStore;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModelProvider;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ androidx.view.ViewModelProvider create$default(androidx.view.ViewModelProvider.Companion companion, androidx.view.ViewModelStoreOwner viewModelStoreOwner, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                factory = androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel(viewModelStoreOwner);
            }
            if ((i & 4) != 0) {
                creationExtras = androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel(viewModelStoreOwner);
            }
            return companion.create(viewModelStoreOwner, factory, creationExtras);
        }

        public static /* synthetic */ androidx.view.ViewModelProvider create$default(androidx.view.ViewModelProvider.Companion companion, androidx.view.ViewModelStore viewModelStore, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                factory = androidx.view.viewmodel.internal.DefaultViewModelProviderFactory.INSTANCE;
            }
            if ((i & 4) != 0) {
                creationExtras = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            return companion.create(viewModelStore, factory, creationExtras);
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.ViewModelProvider create(androidx.view.ViewModelStoreOwner owner, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
            return new androidx.view.ViewModelProvider(owner.getViewModelStore(), factory, extras);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.ViewModelProvider create(androidx.view.ViewModelStore store, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(store, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
            return new androidx.view.ViewModelProvider(store, factory, extras);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public <T extends androidx.view.ViewModel> T get(java.lang.Class<T> modelClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        return (T) get(kotlin.jvm.JvmClassMappingKt.getKotlinClass(modelClass));
    }

    public final <T extends androidx.view.ViewModel> T get(java.lang.String key, kotlin.reflect.KClass<T> modelClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        return (T) this.Camera2StreamConfigurationMap.getViewModel$lifecycle_viewmodel(modelClass, key);
    }

    public <T extends androidx.view.ViewModel> T get(java.lang.String key, java.lang.Class<T> modelClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        return (T) this.Camera2StreamConfigurationMap.getViewModel$lifecycle_viewmodel(kotlin.jvm.JvmClassMappingKt.getKotlinClass(modelClass), key);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.ViewModelProvider.Factory.Companion INSTANCE = androidx.lifecycle.ViewModelProvider.Factory.Companion.getHighResolutionOutputSizeshNQ4ISI;

        default <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            return (T) androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel();
        }

        default <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass, androidx.view.viewmodel.CreationExtras extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
            return (T) create(modelClass);
        }

        default <T extends androidx.view.ViewModel> T create(kotlin.reflect.KClass<T> modelClass, androidx.view.viewmodel.CreationExtras extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
            return (T) create(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) modelClass), extras);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00020\u00072\u001a\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "<init>", "()V", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "Landroidx/lifecycle/ViewModelProvider$Factory;", "from", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ androidx.lifecycle.ViewModelProvider.Factory.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.lifecycle.ViewModelProvider.Factory.Companion();

            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.ViewModelProvider.Factory from(androidx.view.viewmodel.ViewModelInitializer<?>... initializers) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializers, "");
                return androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel((androidx.view.viewmodel.ViewModelInitializer<?>[]) java.util.Arrays.copyOf(initializers, initializers.length));
            }
        }

        @kotlin.jvm.JvmStatic
        static androidx.lifecycle.ViewModelProvider.Factory from(androidx.view.viewmodel.ViewModelInitializer<?>... viewModelInitializerArr) {
            return INSTANCE.from(viewModelInitializerArr);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000e"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class NewInstanceFactory implements androidx.lifecycle.ViewModelProvider.Factory {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion INSTANCE = new androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion(null);
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> VIEW_MODEL_KEY = androidx.view.ViewModelProvider.VIEW_MODEL_KEY;
        private static androidx.lifecycle.ViewModelProvider.NewInstanceFactory getHighResolutionOutputSizeshNQ4ISI;

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            return (T) androidx.view.viewmodel.internal.JvmViewModelProviders.INSTANCE.createViewModel(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass, androidx.view.viewmodel.CreationExtras extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.view.ViewModel> T create(kotlin.reflect.KClass<T> modelClass, androidx.view.viewmodel.CreationExtras extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
            return (T) create(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) modelClass), extras);
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getInstance", "()Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getInstance$annotations", "instance", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            @kotlin.jvm.JvmStatic
            public static /* synthetic */ void getInstance$annotations() {
            }

            private Companion() {
            }

            public final androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
                if (androidx.lifecycle.ViewModelProvider.NewInstanceFactory.getHighResolutionOutputSizeshNQ4ISI == null) {
                    androidx.lifecycle.ViewModelProvider.NewInstanceFactory.getHighResolutionOutputSizeshNQ4ISI = new androidx.lifecycle.ViewModelProvider.NewInstanceFactory();
                }
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory newInstanceFactory = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(newInstanceFactory);
                return newInstanceFactory;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
            return INSTANCE.getInstance();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0013J/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroid/app/Application;", "p0", "", "p1", "<init>", "(Landroid/app/Application;B)V", "()V", "application", "(Landroid/app/Application;)V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/ViewModel;", "getHighSpeedVideoFpsRangesFor", "Landroid/app/Application;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class AndroidViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application> APPLICATION_KEY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion INSTANCE = new androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion(null);
        private static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final android.app.Application Camera2StreamConfigurationMap;

        private AndroidViewModelFactory(android.app.Application application, byte b) {
            this.Camera2StreamConfigurationMap = application;
        }

        public AndroidViewModelFactory() {
            this(null, (byte) 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(android.app.Application application) {
            this(application, (byte) 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass, androidx.view.viewmodel.CreationExtras extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
            if (this.Camera2StreamConfigurationMap != null) {
                return (T) create(modelClass);
            }
            android.app.Application application = (android.app.Application) extras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) getHighSpeedVideoFpsRanges(modelClass, application);
            }
            if (androidx.view.AndroidViewModel.class.isAssignableFrom(modelClass)) {
                throw new java.lang.IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            android.app.Application application = this.Camera2StreamConfigurationMap;
            if (application == null) {
                throw new java.lang.UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            }
            return (T) getHighSpeedVideoFpsRanges(modelClass, application);
        }

        private final <T extends androidx.view.ViewModel> T getHighSpeedVideoFpsRanges(java.lang.Class<T> p0, android.app.Application p1) {
            if (androidx.view.AndroidViewModel.class.isAssignableFrom(p0)) {
                try {
                    T newInstance = p0.getConstructor(android.app.Application.class).newInstance(p1);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
                    return newInstance;
                } catch (java.lang.IllegalAccessException e) {
                    throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(p0)), e);
                } catch (java.lang.InstantiationException e2) {
                    throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(p0)), e2);
                } catch (java.lang.NoSuchMethodException e3) {
                    throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(p0)), e3);
                } catch (java.lang.reflect.InvocationTargetException e4) {
                    throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(p0)), e4);
                }
            }
            return (T) super.create(p0);
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "getInstance", "(Landroid/app/Application;)Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(android.app.Application application) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
                if (androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.getHighSpeedVideoFpsRanges == null) {
                    androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.getHighSpeedVideoFpsRanges = new androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory(application);
                }
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory androidViewModelFactory = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(androidViewModelFactory);
                return androidViewModelFactory;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            androidx.view.viewmodel.CreationExtras.Companion companion = androidx.view.viewmodel.CreationExtras.INSTANCE;
            APPLICATION_KEY = new androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application>() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1
            };
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(android.app.Application application) {
            return INSTANCE.getInstance(application);
        }
    }

    static {
        androidx.view.viewmodel.CreationExtras.Companion companion = androidx.view.viewmodel.CreationExtras.INSTANCE;
        VIEW_MODEL_KEY = new androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String>() { // from class: androidx.lifecycle.ViewModelProvider$special$$inlined$Key$1
        };
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.ViewModelProvider create(androidx.view.ViewModelStoreOwner viewModelStoreOwner, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras) {
        return INSTANCE.create(viewModelStoreOwner, factory, creationExtras);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "viewModel", "", "onRequery", "(Landroidx/lifecycle/ViewModel;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class OnRequeryFactory {
        public void onRequery(androidx.view.ViewModel viewModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.ViewModelProvider create(androidx.view.ViewModelStore viewModelStore, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras) {
        return INSTANCE.create(viewModelStore, factory, creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(androidx.view.ViewModelStore viewModelStore, androidx.lifecycle.ViewModelProvider.Factory factory) {
        this(viewModelStore, factory, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
    }
}
