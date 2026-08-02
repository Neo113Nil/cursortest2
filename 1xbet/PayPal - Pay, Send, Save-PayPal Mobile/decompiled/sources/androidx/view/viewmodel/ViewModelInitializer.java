package androidx.view.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bB0\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R+\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", "T", "", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "initializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Class;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/reflect/KClass;", "getClazz$lifecycle_viewmodel", "()Lkotlin/reflect/KClass;", "Lkotlin/jvm/functions/Function1;", "getInitializer$lifecycle_viewmodel", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewModelInitializer<T extends androidx.view.ViewModel> {
    private final kotlin.reflect.KClass<T> clazz;
    private final kotlin.jvm.functions.Function1<androidx.view.viewmodel.CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function1<? super androidx.view.viewmodel.CreationExtras, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.clazz = kClass;
        this.initializer = function1;
    }

    public final kotlin.reflect.KClass<T> getClazz$lifecycle_viewmodel() {
        return this.clazz;
    }

    public final kotlin.jvm.functions.Function1<androidx.view.viewmodel.CreationExtras, T> getInitializer$lifecycle_viewmodel() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(java.lang.Class<T> cls, kotlin.jvm.functions.Function1<? super androidx.view.viewmodel.CreationExtras, ? extends T> function1) {
        this(kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls), function1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }
}
