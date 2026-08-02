package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b\u001aC\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aZ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aA\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000e\b\n\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b\u001aS\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000e\b\n\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b¨\u0006\u0012²\u0006\u0016\u0010\u0013\u001a\u00020\u0011\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008a\u0084\u0002²\u0006\u0016\u0010\u0013\u001a\u00020\u0011\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"activityViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "createViewModelLazy", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Landroidx/lifecycle/ViewModelStore;", "viewModels", "ownerProducer", "Landroidx/lifecycle/ViewModelStoreOwner;", "fragment-ktx_release", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt {
    public static /* synthetic */ kotlin.Lazy viewModels$default(final androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new kotlin.jvm.functions.Function0<androidx.fragment.app.Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.fragment.app.Fragment invoke() {
                    return androidx.fragment.app.Fragment.this;
                }

                {
                    super(0);
                }
            };
        }
        if ((i & 2) != 0) {
            function02 = null;
        }
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$owner$2(function0));
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2(lazy);
        androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3(lazy);
        if (function02 == null) {
            function02 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, function02);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> viewModels(androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function0<? extends androidx.view.ViewModelStoreOwner> function0, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function02) {
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$owner$2(function0));
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2(lazy);
        androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3(lazy);
        if (function02 == null) {
            function02 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, function02);
    }

    public static /* synthetic */ kotlin.Lazy viewModels$default(final androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new kotlin.jvm.functions.Function0<androidx.fragment.app.Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.fragment.app.Fragment invoke() {
                    return androidx.fragment.app.Fragment.this;
                }

                {
                    super(0);
                }
            };
        }
        if ((i & 2) != 0) {
            function02 = null;
        }
        if ((i & 4) != 0) {
            function03 = null;
        }
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$owner$4(function0));
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6(lazy);
        androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7(function02, lazy);
        if (function03 == null) {
            function03 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, function03);
    }

    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> viewModels(androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function0<? extends androidx.view.ViewModelStoreOwner> function0, kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function02, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function03) {
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$owner$4(function0));
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6(lazy);
        androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7(function02, lazy);
        if (function03 == null) {
            function03 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, function03);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> activityViewModels(androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1(fragment);
        androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (function0 == null) {
            function0 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, function0);
    }

    public static /* synthetic */ kotlin.Lazy activityViewModels$default(androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1(fragment);
        androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (function0 == null) {
            function0 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, function0);
    }

    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> activityViewModels(androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function0, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function02) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4(fragment);
        androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5(function0, fragment);
        if (function02 == null) {
            function02 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, function02);
    }

    public static /* synthetic */ kotlin.Lazy activityViewModels$default(androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function02 = null;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4(fragment);
        androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5(function0, fragment);
        if (function02 == null) {
            function02 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, function02);
    }

    public static /* synthetic */ kotlin.Lazy createViewModelLazy$default(androidx.fragment.app.Fragment fragment, kotlin.reflect.KClass kClass, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function02 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function02);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    public static final /* synthetic */ kotlin.Lazy createViewModelLazy(final androidx.fragment.app.Fragment fragment, kotlin.reflect.KClass kClass, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02) {
        return createViewModelLazy(fragment, kClass, function0, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final androidx.view.viewmodel.CreationExtras invoke() {
                return androidx.fragment.app.Fragment.this.getDefaultViewModelCreationExtras();
            }

            {
                super(0);
            }
        }, function02);
    }

    public static /* synthetic */ kotlin.Lazy createViewModelLazy$default(final androidx.fragment.app.Fragment fragment, kotlin.reflect.KClass kClass, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final androidx.view.viewmodel.CreationExtras invoke() {
                    return androidx.fragment.app.Fragment.this.getDefaultViewModelCreationExtras();
                }

                {
                    super(0);
                }
            };
        }
        if ((i & 8) != 0) {
            function03 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function02, function03);
    }

    public static final <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> createViewModelLazy(final androidx.fragment.app.Fragment fragment, kotlin.reflect.KClass<VM> kClass, kotlin.jvm.functions.Function0<? extends androidx.view.ViewModelStore> function0, kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function02, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function03) {
        if (function03 == null) {
            function03 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                    return androidx.fragment.app.Fragment.this.getDefaultViewModelProviderFactory();
                }

                {
                    super(0);
                }
            };
        }
        return new androidx.view.ViewModelLazy(kClass, function0, function03, function02);
    }

    /* renamed from: access$viewModels$lambda-0, reason: not valid java name */
    public static final /* synthetic */ androidx.view.ViewModelStoreOwner m9157access$viewModels$lambda0(kotlin.Lazy lazy) {
        return (androidx.view.ViewModelStoreOwner) lazy.getValue();
    }

    /* renamed from: access$viewModels$lambda-1, reason: not valid java name */
    public static final /* synthetic */ androidx.view.ViewModelStoreOwner m9158access$viewModels$lambda1(kotlin.Lazy lazy) {
        return (androidx.view.ViewModelStoreOwner) lazy.getValue();
    }
}
