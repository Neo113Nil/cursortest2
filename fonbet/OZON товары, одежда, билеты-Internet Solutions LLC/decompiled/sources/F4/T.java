package F4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class T<T> extends F<T> {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final F<T> f8851k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f8852l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f8853m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(@NotNull F<T> pagedList) {
        super(pagedList.m(), pagedList.h(), pagedList.k(), pagedList.o().u(), pagedList.g());
        Intrinsics.checkNotNullParameter(pagedList, "pagedList");
        this.f8851k = pagedList;
        this.f8852l = true;
        this.f8853m = true;
    }

    @Override // F4.F
    public final void e(@NotNull Function2<? super y, ? super x, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // F4.F
    public final Object i() {
        return this.f8851k.i();
    }

    @Override // F4.F
    public final boolean q() {
        return this.f8853m;
    }

    @Override // F4.F
    public final boolean r() {
        return this.f8852l;
    }

    @Override // F4.F
    public final void u(int i11) {
    }
}
