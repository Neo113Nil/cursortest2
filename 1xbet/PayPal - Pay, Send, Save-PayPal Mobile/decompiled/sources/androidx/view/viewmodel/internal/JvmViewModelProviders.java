package androidx.view.viewmodel.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/JvmViewModelProviders;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "createViewModel", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JvmViewModelProviders {
    public static final androidx.view.viewmodel.internal.JvmViewModelProviders INSTANCE = new androidx.view.viewmodel.internal.JvmViewModelProviders();

    private JvmViewModelProviders() {
    }

    public final <T extends androidx.view.ViewModel> T createViewModel(java.lang.Class<T> modelClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        try {
            java.lang.reflect.Constructor<T> declaredConstructor = modelClass.getDeclaredConstructor(new java.lang.Class[0]);
            if (!java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(modelClass)));
            }
            try {
                T newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
                return newInstance;
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(modelClass)), e);
            } catch (java.lang.InstantiationException e2) {
                throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(modelClass)), e2);
            }
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(modelClass)), e3);
        }
    }
}
