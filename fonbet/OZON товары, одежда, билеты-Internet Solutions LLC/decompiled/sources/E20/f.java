package E20;

import R20.u;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7394a;

    f(a aVar) {
        this.f7394a = aVar;
    }

    @Override // androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        a aVar = this.f7394a;
        return new u(aVar.n(), a.i(aVar), a.m(aVar), aVar.v());
    }
}
