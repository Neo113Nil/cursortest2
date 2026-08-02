package S2;

import R2.C3909c;
import R2.InterfaceC3910d;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b<T> implements InterfaceC3910d<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f25679a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super C3909c, ? extends T> produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f25679a = (AbstractC7737t) produceNewData;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // R2.InterfaceC3910d
    public final Object a(@NotNull C3909c c3909c) throws IOException {
        return this.f25679a.invoke(c3909c);
    }
}
