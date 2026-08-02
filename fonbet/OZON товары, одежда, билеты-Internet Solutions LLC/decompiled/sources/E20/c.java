package E20;

import P20.s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7388a;

    c(a aVar) {
        this.f7388a = aVar;
    }

    @Override // androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        a aVar = this.f7388a;
        return new s(aVar.n(), new P20.f(), new P20.c(), a.k(aVar));
    }
}
