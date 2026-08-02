package ad0;

import androidx.activity.M;
import androidx.lifecycle.AbstractC5405a;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends AbstractC5405a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f36590d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f36591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, e eVar2) {
        super(eVar, null);
        this.f36590d = eVar;
        this.f36591e = eVar2;
    }

    @Override // androidx.lifecycle.AbstractC5405a
    protected final <T extends w0> T b(String key, Class<T> modelClass, C5418g0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        M requireActivity = this.f36590d.requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.nativeauth.di.DiModuleProvider");
        Bc0.b i11 = ((Bc0.c) requireActivity).h().i();
        String string = this.f36591e.requireArguments().getString("screen_id_args_key");
        if (string != null) {
            return i11.j(handle, string);
        }
        throw new IllegalStateException("Use Fragment.newInstance");
    }
}
