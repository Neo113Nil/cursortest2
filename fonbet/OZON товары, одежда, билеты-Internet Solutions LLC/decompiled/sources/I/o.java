package I;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.List;

/* loaded from: classes8.dex */
final class o implements b.c<List<Object>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f11282a;

    o(r rVar) {
        this.f11282a = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.concurrent.futures.b.c
    public final Object c(@NonNull b.a<List<Object>> aVar) {
        r rVar = this.f11282a;
        x2.i.f("The result can only set once!", rVar.f11292f == null);
        rVar.f11292f = aVar;
        return "ListFuture[" + this + "]";
    }
}
