package Yg0;

import java.util.concurrent.CompletableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class f extends AbstractC7737t implements Function1<Unit, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CompletableFuture<Unit> f35080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(CompletableFuture<Unit> completableFuture) {
        super(1);
        this.f35080b = completableFuture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Unit unit) {
        return Boolean.valueOf(this.f35080b.complete(Unit.f71690a));
    }
}
