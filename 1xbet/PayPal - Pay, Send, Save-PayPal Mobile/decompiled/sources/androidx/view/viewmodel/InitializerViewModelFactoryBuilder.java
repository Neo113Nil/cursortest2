package androidx.view.viewmodel;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\b\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0016\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "initializer", "", "addInitializer", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "build", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
@androidx.view.viewmodel.ViewModelFactoryDsl
/* loaded from: classes.dex */
public final class InitializerViewModelFactoryBuilder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<kotlin.reflect.KClass<?>, androidx.view.viewmodel.ViewModelInitializer<?>> getHighSpeedVideoSizes = new java.util.LinkedHashMap();

    public final <T extends androidx.view.ViewModel> void addInitializer(kotlin.reflect.KClass<T> clazz, kotlin.jvm.functions.Function1<? super androidx.view.viewmodel.CreationExtras, ? extends T> initializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializer, "");
        if (this.getHighSpeedVideoSizes.containsKey(clazz)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("A `initializer` with the same `clazz` has already been added: ");
            sb.append(androidx.view.viewmodel.internal.CanonicalName_jvmKt.getCanonicalName(clazz));
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        this.getHighSpeedVideoSizes.put(clazz, new androidx.view.viewmodel.ViewModelInitializer<>(clazz, initializer));
    }

    public final androidx.lifecycle.ViewModelProvider.Factory build() {
        return androidx.view.viewmodel.internal.ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel(this.getHighSpeedVideoSizes.values());
    }
}
