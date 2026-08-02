package Ve;

import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Rq implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f29877a;

    public Rq(Map viewModels) {
        Intrinsics.checkNotNullParameter(viewModels, "viewModels");
        this.f29877a = viewModels;
    }

    @Override // androidx.lifecycle.z0.b
    public final androidx.lifecycle.w0 create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Pc.a aVar = (Pc.a) this.f29877a.get(modelClass);
        androidx.lifecycle.w0 w0Var = aVar != null ? (androidx.lifecycle.w0) aVar.get() : null;
        Intrinsics.g(w0Var, "null cannot be cast to non-null type T of spay.sdk.di.module.defaultPaymentModule.viewModel.ViewModelFactory.create");
        return w0Var;
    }
}
