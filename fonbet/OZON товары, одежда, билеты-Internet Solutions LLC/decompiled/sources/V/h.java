package V;

import C.C2703x;
import androidx.concurrent.futures.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h implements I.c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b.a<C2703x> f27893a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2703x f27894b;

    h(b.a<C2703x> aVar, C2703x c2703x) {
        this.f27893a = aVar;
        this.f27894b = c2703x;
    }

    @Override // I.c
    public final void onFailure(@NotNull Throwable t2) {
        Intrinsics.checkNotNullParameter(t2, "t");
        this.f27893a.e(t2);
    }

    @Override // I.c
    public final void onSuccess(Void r22) {
        this.f27893a.c(this.f27894b);
    }
}
