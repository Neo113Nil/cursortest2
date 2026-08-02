package E20;

import K20.t;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7387a;

    b(a aVar) {
        this.f7387a = aVar;
    }

    @Override // androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        a aVar = this.f7387a;
        return new t(aVar.n(), a.h(aVar));
    }
}
