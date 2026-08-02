package Ce;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ce.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2758a implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.concurrent.futures.c f4810a;

    C2758a(androidx.concurrent.futures.c cVar) {
        this.f4810a = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f4810a.cancel(false);
        return Unit.f71690a;
    }
}
