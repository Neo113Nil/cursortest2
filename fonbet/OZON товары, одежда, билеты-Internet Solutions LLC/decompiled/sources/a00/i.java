package a00;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class i implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function0<Object> f36138a;

    i(Function0<Object> function0) {
        this.f36138a = function0;
    }

    @Override // androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Object invoke = this.f36138a.invoke();
        Intrinsics.g(invoke, "null cannot be cast to non-null type T of ru.ozon.composer.common.ui.ViewModelOwnerProviderKt.viewModelFactory.<no name provided>.create");
        return (T) invoke;
    }
}
