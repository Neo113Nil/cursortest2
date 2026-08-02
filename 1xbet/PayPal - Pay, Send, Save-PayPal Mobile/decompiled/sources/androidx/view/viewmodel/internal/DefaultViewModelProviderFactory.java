package androidx.view.viewmodel.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/DefaultViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultViewModelProviderFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    public static final androidx.view.viewmodel.internal.DefaultViewModelProviderFactory INSTANCE = new androidx.view.viewmodel.internal.DefaultViewModelProviderFactory();

    private DefaultViewModelProviderFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.view.ViewModel> T create(kotlin.reflect.KClass<T> modelClass, androidx.view.viewmodel.CreationExtras extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
        return (T) androidx.view.viewmodel.internal.JvmViewModelProviders.INSTANCE.createViewModel(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) modelClass));
    }
}
