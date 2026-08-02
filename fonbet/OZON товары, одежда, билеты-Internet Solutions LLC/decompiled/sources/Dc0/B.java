package Dc0;

import androidx.activity.M;
import androidx.lifecycle.AbstractC5405a;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class B extends AbstractC5405a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ q f6411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(q qVar) {
        super(qVar, null);
        this.f6411d = qVar;
    }

    @Override // androidx.lifecycle.AbstractC5405a
    protected final <T extends w0> T b(String key, Class<T> modelClass, C5418g0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        M requireActivity = this.f6411d.requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.nativeauth.di.DiModuleProvider");
        return ((Bc0.c) requireActivity).h().i().e();
    }
}
