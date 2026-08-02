package K1;

import b1.InterfaceC5515r;
import b1.InterfaceC5518u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class C implements InterfaceC5515r<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f14958a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f14959b;

    /* JADX WARN: Multi-variable type inference failed */
    C(Function2<? super InterfaceC5518u, Object, Object> function2, Function1<Object, Object> function1) {
        this.f14958a = (AbstractC7737t) function2;
        this.f14959b = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // b1.InterfaceC5515r
    public final Object a(@NotNull Object obj) {
        return this.f14959b.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // b1.InterfaceC5515r
    public final Object b(@NotNull InterfaceC5518u interfaceC5518u, Object obj) {
        return this.f14958a.invoke(interfaceC5518u, obj);
    }
}
